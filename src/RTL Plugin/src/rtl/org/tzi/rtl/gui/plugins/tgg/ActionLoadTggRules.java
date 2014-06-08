package org.tzi.rtl.gui.plugins.tgg;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import org.tzi.rtl.tgg.manager.RTLRuleTree;
import org.tzi.rtl.tgg.mm.TggRuleCollection;
import org.tzi.rtl.tgg.parser.RTLRuleCompiler;
import org.tzi.use.config.Options;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.gui.util.ExtFileFilter;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.util.Log;

public class ActionLoadTggRules implements IPluginActionDelegate {
	private static TggRuleCollection fTggRules;
	private JFileChooser fChooser;

	public ActionLoadTggRules() {

	}
	private void loadTggRules(String tggRuleFileName, final MainWindow fMainWindow, MSystem system){
		//if (!Options.doGraTra) return;

		InputStream r = null;
		try {
			Log.verbose("compiling TGGsRule specification...");
			r = new BufferedInputStream(new FileInputStream(tggRuleFileName));
			fTggRules = RTLRuleCompiler.compileSpecification(r,
					tggRuleFileName, new PrintWriter(System.err),
					system.model());
			fTggRules.setHTMLFile(tggRuleFileName);
		} catch (FileNotFoundException e) {
			Log.error("File `" + tggRuleFileName + "' not found.");
			//System.exit(1);
		} catch (MSystemException e) {
			// TODO Auto-generated catch block
			Log.error("Error with the triple rule description");
		} finally {
			if (r != null)
				try {
					r.close();
				} catch (IOException ex) {
					// ignored
				}
		} 
		//	We use own panel
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RTLRuleTree.createAndShowGUI(fTggRules, fMainWindow);
			}
		});
	}

	public void performAction(IPluginAction pluginAction) {
		final Session fSession = pluginAction.getSession();
		final MainWindow fMainWindow = pluginAction.getParent();
		MSystem fSystem = fSession.system();
		String path;
		if (fChooser == null) {
			path = Options.getLastDirectory();
			//	path = System.getProperty("user.dir");
			fChooser = new JFileChooser(path);
			ExtFileFilter filter = new ExtFileFilter("tgg",
					"Triple rule description");
			fChooser.addChoosableFileFilter(filter);
			fChooser.setDialogTitle("Triple Rule Visualizer");
		}
		int returnVal = fChooser.showOpenDialog(fMainWindow);
		if (returnVal != JFileChooser.APPROVE_OPTION)
			return;

		path = fChooser.getCurrentDirectory().toString();
		
		path = fChooser.getCurrentDirectory().getAbsolutePath() + "/" + fChooser.getSelectedFile().getName();	
		PrintWriter fLogWriter = fMainWindow.logWriter();
		fLogWriter.println("Compiling the triple rule description: " + path + "...");
		loadTggRules(path, fMainWindow, fSystem);
		fLogWriter.println("Done.");
		//ActionCheckIntegration.setfTggRuleCollection(fTggRules);
	}
	
	/**
	 * @return the fTggRules
	 */
	public static TggRuleCollection getfTggRules() {
		return fTggRules;
	}
}
