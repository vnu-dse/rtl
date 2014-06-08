package org.tzi.use.gui.plugins.tgg;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import org.tzi.use.config.Options;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.gui.plugins.tgg.control.TggTree;
import org.tzi.use.gui.util.ExtFileFilter;

import org.tzi.use.main.Session;
import org.tzi.use.parser.tgg.RTLCompiler;
import org.tzi.use.parser.use.USECompiler;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;
import org.tzi.use.tgg.TggRuleCollection;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.ModelFactory;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.MSystemException;

import rtl.parser.main.TGGParser;

/**
 * 
 * @author Xuan-Loi Vu
 *
 */
public class ActionParserInputFile implements IPluginActionDelegate {
	//	private TggRuleCollection fTggRules;
	JFileChooser fChooser;
	TGGParser myTGGParser;
	
	TggRuleCollection fTggRules;
	
	public ActionParserInputFile() {
	}

	private void generateInputFile(String path, String filename, PrintWriter fLogWriter) {
		myTGGParser = new TGGParser(path, filename, fLogWriter);
		myTGGParser.parserFileInput();
	}
	
	
	private void loadModelAndTGGsRuleSpecification(final MainWindow fMainWindow,
			final Session fSession, final PrintWriter fLogWriter) {
		String modelFile = myTGGParser.getNameOfUseFile();
		if(modelFile == null) {
			fLogWriter.println("Your input file doesn't contain a model specification");
			return;
		}
		/**
		 * Load model
		 */
		File f = new File(modelFile);
		fLogWriter.println("Loading model specification from file: " + f.getAbsolutePath() + " ...");
		MModel model = null;
		MSystem system = null;
		FileInputStream iStream = null;
		try {
			iStream = new FileInputStream(f);
			model = USECompiler.compileSpecification(iStream, f.getAbsolutePath(),
					fLogWriter, new ModelFactory());
			fLogWriter.println("Done.");
			if (model != null) {
				fLogWriter.println(model.getStats());
				// create system
				system = new MSystem(model);
			}
		} catch (FileNotFoundException ex) {
			fLogWriter.println("File `" + f.getAbsolutePath() + "' not found.");
		} finally {
			if (iStream != null)
				try {
					iStream.close();
				} catch (IOException ex) {
					// ignored
				}
		}
		// set new system (may be null if compilation failed)
		final MSystem system2 = system; // need final variable for Runnable
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				fSession.setSystem(system2);
				/**
				 * Load TGGsRule Specification
				 */
				InputStream r = null;
				String tggRuleFileName = myTGGParser.getNameOfTGGsRuleFile();
				if(tggRuleFileName != null) {
					try {
						fLogWriter.println("Loading TGGsRule specification: " + tggRuleFileName + " ...");
						r = new BufferedInputStream(new FileInputStream(tggRuleFileName));
						fTggRules = RTLCompiler.compileSpecification(r, tggRuleFileName,
								fLogWriter, system2.model());
						fTggRules.setHTMLFile(tggRuleFileName);
					} catch (FileNotFoundException e) {
						fLogWriter.println("File `" + tggRuleFileName + "' not found.");
					} catch (MSystemException e) {
						// TODO Auto-generated catch block
						fLogWriter.println("Error with the TGGsRule specification");
					} catch (Exception e) {
						fLogWriter.println(e.getMessage());
					}
					finally {
						fLogWriter.println("Done.");
						if (r != null)
							try {
								r.close();
							} catch (IOException ex) {
								// ignored
							}
					}
					// We use own panel
					javax.swing.SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							TggTree.createAndShowGUI(fTggRules, fMainWindow);
						}
					});
				}
			}
		});
	}
	
	
	public void performAction(IPluginAction pluginAction) {
		Session fSession = pluginAction.getSession();
		MainWindow fMainWindow = pluginAction.getParent();
		PrintWriter fLogWriter = fMainWindow.logWriter();
		
		String path, filename;
		if (fChooser == null) {
			path = Options.getLastDirectory();
			fChooser = new JFileChooser(path);
			ExtFileFilter filter = new ExtFileFilter("txt",
					"RTL specifications");
			fChooser.addChoosableFileFilter(filter);
			fChooser.setDialogTitle("Open RTL specification");
		}
		int returnVal = fChooser.showOpenDialog(fMainWindow);
		if (returnVal != JFileChooser.APPROVE_OPTION)
			return;
		
		path = fChooser.getCurrentDirectory().getAbsolutePath();
		filename = fChooser.getCurrentDirectory().getAbsolutePath() + "/" + fChooser.getSelectedFile().getName();
		/**
		 * Generate all ouput files from input file
		 */
		generateInputFile(path, filename, fLogWriter);
		
		/**
		 * Load USE and TGGsRule Specification
		 */
		loadModelAndTGGsRuleSpecification(fMainWindow, fSession, fLogWriter);
	}
}
