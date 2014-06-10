package org.tzi.rtl.gui.views.forms.tgg;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.*;

import org.tzi.rtl.tgg.mm.MTggRule;
import org.tzi.rtl.tgg.mm.TggRuleCollection;
import org.tzi.rtl.tgg.parser.RTLKeyword;
import org.tzi.rtl.tgg.parser.RTLRuleCompiler;
import org.tzi.use.config.Options;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.gui.main.ModelBrowser;
import org.tzi.use.gui.util.CloseOnEscapeKeyListener;
import org.tzi.use.gui.util.ExtFileFilter;
import org.tzi.use.gui.util.GridBagHelper;
import org.tzi.use.main.ChangeEvent;
import org.tzi.use.main.ChangeListener;
import org.tzi.use.main.Session;
import org.tzi.use.parser.use.USECompiler;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.mm.MAttribute;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.MOperation;
import org.tzi.use.uml.mm.ModelFactory;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.MSystemException;

/**
 * RTL1.1
 * @author Khoa-Hai Nguyen
 * 
 */
@SuppressWarnings("serial")
public class RTLParserParameter extends JDialog {
	private MSystem fSystem;
    private Session fSession;
	private MainWindow fParent;
    private ModelBrowser fModelBrowser;
	private JTextField fTextModel1;
	private JTextField fTextModel2;
	private JTextField fTextTgg;
	private PrintWriter fLogWriter;
	private MModel fModel1;
	private MModel fModel2;
	private MModel fModel;
	private TggRuleCollection fTggRules;
	private String modelName;
	private String useContent;

	public RTLParserParameter(Session session, MainWindow parent) {
		super(parent, "RTL Parser Parameter");
        fSession = session;
		fSession.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				closeDialog();
			}
		});

		fParent = parent;
        fModelBrowser = fParent.getModelBrowser();
		fLogWriter = parent.logWriter();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		// create object name field and label
		fTextModel1 = new JTextField(35);
		JLabel labelModel1 = new JLabel("Source metamodel:");
		labelModel1.setDisplayedMnemonic('O');
		labelModel1.setLabelFor(fTextModel1);

		// create object name field and label
		fTextModel2 = new JTextField(35);
		JLabel labelModel2 = new JLabel("Target metamodel:");
		labelModel2.setDisplayedMnemonic('1');
		labelModel2.setLabelFor(fTextModel2);

		// create object name field and label
		fTextTgg = new JTextField(35);
		JLabel labelTgg = new JLabel("TGG rules:");
		labelTgg.setDisplayedMnemonic('2');
		labelTgg.setLabelFor(fTextTgg);

		// create buttons
		JButton btnPath1 = new JButton("...");
		// btnPath1.setMnemonic('P');
		btnPath1.addActionListener(new ActionListener() {
			private JFileChooser fChooser;

			public void actionPerformed(ActionEvent e) {
				String path;
				if (fChooser == null) {
					path = Options.getLastDirectory();
					fChooser = new JFileChooser(path);
					ExtFileFilter filter = new ExtFileFilter("use",
							"USE specifications");
					fChooser.addChoosableFileFilter(filter);
					fChooser.setDialogTitle("Open specification");
				}
				int returnVal = fChooser
						.showOpenDialog(RTLParserParameter.this);
				if (returnVal != JFileChooser.APPROVE_OPTION)
					return;

				path = fChooser.getCurrentDirectory().toString();
				Options.setLastDirectory(path);

				fTextModel1.setText(Paths.get(path,
						fChooser.getSelectedFile().getName()).toString());

			}
		});
		JButton btnPath2 = new JButton("...");
		// btnPath2.setMnemonic('P');
		btnPath2.addActionListener(new ActionListener() {
			private JFileChooser fChooser;

			public void actionPerformed(ActionEvent e) {
				String path;
				if (fChooser == null) {
					path = Options.getLastDirectory();
					fChooser = new JFileChooser(path);
					ExtFileFilter filter = new ExtFileFilter("use",
							"USE specifications");
					fChooser.addChoosableFileFilter(filter);
					fChooser.setDialogTitle("Open specification");
				}
				int returnVal = fChooser
						.showOpenDialog(RTLParserParameter.this);
				if (returnVal != JFileChooser.APPROVE_OPTION)
					return;

				path = fChooser.getCurrentDirectory().toString();
				Options.setLastDirectory(path);

				fTextModel2.setText(Paths.get(path,
						fChooser.getSelectedFile().getName()).toString());

			}
		});
		JButton btnPath3 = new JButton("...");
		// btnPath3.setMnemonic('P');
		btnPath3.addActionListener(new ActionListener() {
			private JFileChooser fChooser;

			public void actionPerformed(ActionEvent e) {
				String path;
				if (fChooser == null) {
					path = Options.getLastDirectory();
					fChooser = new JFileChooser(path);
					ExtFileFilter filter = new ExtFileFilter("tgg", "TGG Rules");
					fChooser.addChoosableFileFilter(filter);
					fChooser.setDialogTitle("TGG rules");
				}
				int returnVal = fChooser
						.showOpenDialog(RTLParserParameter.this);
				if (returnVal != JFileChooser.APPROVE_OPTION)
					return;

				path = fChooser.getCurrentDirectory().toString();
				Options.setLastDirectory(path);

				fTextTgg.setText(Paths.get(path,
						fChooser.getSelectedFile().getName()).toString());

			}
		});

		JButton btnParse = new JButton("Parse");
		btnParse.setMnemonic('P');
		btnParse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parseRTL();
			}
		});
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeDialog();
			}
		});

		// layout content pane
		JComponent contentPane = (JComponent) getContentPane();
		contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		GridBagHelper gh = new GridBagHelper(contentPane);
		gh
				.add(labelModel1, 0, 0, 6, 1, 0.0, 0.0,
						GridBagConstraints.HORIZONTAL);
		gh
				.add(fTextModel1, 0, 1, 6, 1, 0.0, 0.0,
						GridBagConstraints.HORIZONTAL);
		gh.add(btnPath1, 7, 1, 1, 1, 0.0, 0.0, GridBagConstraints.HORIZONTAL);

		gh
				.add(labelModel2, 0, 2, 6, 1, 0.0, 0.0,
						GridBagConstraints.HORIZONTAL);
		gh
				.add(fTextModel2, 0, 3, 6, 1, 0.0, 0.0,
						GridBagConstraints.HORIZONTAL);
		gh.add(btnPath2, 7, 3, 1, 1, 0.0, 0.0, GridBagConstraints.HORIZONTAL);

		gh.add(labelTgg, 0, 4, 6, 1, 0.0, 0.0, GridBagConstraints.HORIZONTAL);
		gh.add(fTextTgg, 0, 5, 6, 1, 0.0, 0.0, GridBagConstraints.HORIZONTAL);
		gh.add(btnPath3, 7, 5, 1, 1, 0.0, 0.0, GridBagConstraints.HORIZONTAL);

		// gh.add(new JPanel(), 1, 2,
		// 1, 1, 0.0, 1.0, GridBagConstraints.BOTH);

		gh.add(btnParse, 0, 6, 1, 1, 0.0, 0.0, GridBagConstraints.HORIZONTAL);

		gh.add(btnClose, 1, 6, 1, 1, 0.0, 0.0, GridBagConstraints.HORIZONTAL);

		getRootPane().setDefaultButton(btnParse);
		pack();
		setSize(new Dimension(355, 194));
		setResizable(false);
		setLocationRelativeTo(parent);
		// fListClasses.requestFocus();

		// allow dialog close on escape key
		CloseOnEscapeKeyListener ekl = new CloseOnEscapeKeyListener(this);
		addKeyListener(ekl);
        /* Hard code to load model */
		fTextModel1.setText("demo/Act.use");
		fTextModel2.setText("demo/CSP.use");
		fTextTgg.setText("demo/uml2cspRule.tgg");
	}

	private void closeDialog() {
		setVisible(false);
		dispose();
	}

	private void parseRTL() {
		if (checkPath()) {
			// Parse metamodel
			parseModels();
			// Parse TGG rule
			parseTGGRule();
			// gen USE file
			genUSEContent();
			writeUSEFile();

            /* Load model and RTL rules */
            if (fModel != null) {
                fSystem = new MSystem(fModel);
                fSession.setSystem(fSystem);
            }
            fModelBrowser.setRTLRule(fTggRules);
            fModelBrowser.setRTLRuleFileName(fTextTgg.getText());

            fLogWriter.println("Compile success");
		} else {
			fLogWriter.println("Error in path file");
		}
	}

	private void genUSEContent() {
		fLogWriter.println("Compile USE model specification...");
		useContent += genClassesCorr();
		useContent += genAssociationsCorr();
		useContent += genInvariantsCorr();
		useContent += genRuleCollection();
	}

	/**
	 * Generate class RuleCollection
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String genRuleCollection() {
		String use = "";
		use += "class RuleCollection\n";
		// operations
		use += "------------------------------------------------------------Operations\n";
		use += RTLKeyword.startOperation + "\n";
		use += "------------------------------Co-Evolution operations\n";
		// Co-Evolution transformation
		for (Iterator iter = fTggRules.getTggRules().iterator(); iter.hasNext();) {
			MTggRule tgg = (MTggRule) iter.next();
			use += tgg.buildParamsForCoEvol(2) + "\n";
		}
		// Forward transformation
		use += "------------------------------Forward transformation operation\n";
		for (Iterator iter = fTggRules.getTggRules().iterator(); iter.hasNext();) {
			MTggRule tgg = (MTggRule) iter.next();
			use += tgg.buildParamsForFwdTrafo(2) + "\n";
		}
		// Integration
		use += "------------------------------Integration operation\n";
		for (Iterator iter = fTggRules.getTggRules().iterator(); iter.hasNext();) {
			MTggRule tgg = (MTggRule) iter.next();
			use += tgg.buildParamsForIntegration(2) + "\n";
		}
		// Integration
		use += RTLKeyword.endClass + "\n";
		// before generate pre, postcondition, reload model to have class
		// RuleCollection and operations
		fModel = USECompiler.compileSpecification(useContent + use, modelName,
				fLogWriter, new ModelFactory());
		List<MOperation> ops = fModel.getClass("RuleCollection")
				.allOperations();
		MOperation operation = null;
		// Pre, Post-condition
		use += "------------------------------------------------------------Pre, post-conditions\n";
		use += "\nconstraints";
		// co-evolution
		use += "\n------------------------------Co-Evolution\n";
		for (Iterator iter = fTggRules.getTggRules().iterator(); iter.hasNext();) {
			MTggRule tgg = (MTggRule) iter.next();
			for (Iterator iter1 = ops.iterator(); iter1.hasNext();) {
				operation = (MOperation) iter1.next();
				if (operation.name()
						.equals(tgg.name() + RTLKeyword.coEvolution))
					break;
			}

			use += "\ncontext RuleCollection::" + tgg.buildParamsForCoEvol(0);
			use += tgg.buildPreConditionForCoEvol(operation, 2) + "\n";
			use += tgg.buildPostConditionForCoEvol(operation, 2) + "\n";
		}
		// forward transformation
		use += "\n" + RTLKeyword.comment(50, '-') + "Forward transformation\n";
		for (Iterator iter = fTggRules.getTggRules().iterator(); iter.hasNext();) {
			MTggRule tgg = (MTggRule) iter.next();
			for (Iterator iter1 = ops.iterator(); iter1.hasNext();) {
				operation = (MOperation) iter1.next();
				if (operation.name().equals(
						tgg.name() + RTLKeyword.forwardTransform))
					break;
			}
			use += "\ncontext RuleCollection::" + tgg.buildParamsForFwdTrafo(0);
			use += tgg.buildPreConditionForFwdTrafo(operation, 2) + "\n";
			use += tgg.buildPostConditionForFwdTrafo(operation, 2) + "\n";
		}
		// Integration
		use += "\n" + RTLKeyword.comment(50, '-') + "Integration\n";
		for (Iterator iter = fTggRules.getTggRules().iterator(); iter.hasNext();) {
			MTggRule tgg = (MTggRule) iter.next();
			for (Iterator iter1 = ops.iterator(); iter1.hasNext();) {
				operation = (MOperation) iter1.next();
				if (operation.name()
						.equals(tgg.name() + RTLKeyword.integration))
					break;
			}
			use += "\ncontext RuleCollection::"
					+ tgg.buildParamsForIntegration(0);
			use += tgg.buildPreConditionForIntegration(operation, 2) + "\n";
			use += tgg.buildPostConditionForIntegration(operation, 2) + "\n";
		}
		return use;
	}

	/**
	 * Generate class string for correspondence class
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String genClassesCorr() {
		String use = "";
		for (Iterator iter = fModel.classes().iterator(); iter.hasNext();) {
			MClass cls = (MClass) iter.next();
			if (!fModel1.classes().contains(cls)
					&& !fModel2.classes().contains(cls)) {
				use += "\n" + RTLKeyword.startClass + " " + cls.name() + "\n";
				if (cls.attributes().size() > 0)
					use += RTLKeyword.startAttributes + "\n";
				for (Iterator atts = cls.attributes().iterator(); atts
						.hasNext();) {
					MAttribute att = (MAttribute) atts.next();
					use += RTLKeyword.indent + att.name() + " : "
							+ att.type().toString() + "\n";
				}
				if (cls.operations().size() > 0)
					use += RTLKeyword.startOperation + "\n";
				for (Iterator ops = cls.operations().iterator(); ops.hasNext();) {
					// MOperation op = (MOperation) ops.next();
					// use += RTLKeyword.indent + op.name() + " : " +
					// op.hasBody();
				}
				use += RTLKeyword.endClass + "\n";
			}

		}
		return use;
	}

	/**
	 * Generate association string for correspondence class
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String genAssociationsCorr() {
		String use = "";
		for (Iterator iter = fModel.associations().iterator(); iter.hasNext();) {
			MAssociation assoc = (MAssociation) iter.next();
			if (!fModel1.associations().contains(assoc)
					&& !fModel2.associations().contains(assoc)) {
				use += RTLKeyword.startAssociation + " " + assoc.name() + " "
						+ RTLKeyword.between + "\n";
				for (Iterator iter1 = assoc.associationEnds().iterator(); iter1
						.hasNext();) {
					MAssociationEnd assocEnd = (MAssociationEnd) iter1.next();
					use += RTLKeyword.indent + assocEnd.cls().name() + "["
							+ assocEnd.multiplicity().toString() + "] "
							+ RTLKeyword.role + " " + assocEnd.nameAsRolename()
							+ "\n";
				}
				use += RTLKeyword.endAssociation + "\n";
			}
		}
		return use;
	}

	/**
	 * generate invariant string for correspondence class
	 * 
	 * @return String: invariant
	 */
	@SuppressWarnings("unchecked")
	private String genInvariantsCorr() {
		String use = "", tmp = "";
		boolean flag = true;
		Map<String, Object> invs;
		for (Iterator iter = fTggRules.getTggRules().iterator(); iter.hasNext();) {
			MTggRule rule = (MTggRule) iter.next();
			invs = rule.genCorrInvariant();
			for (Iterator iter2 = invs.keySet().iterator(); iter2.hasNext();) {
				if (flag) {
					use += "\n-- Invariants for Correspondence classes";
					use += "\n" + RTLKeyword.startConstraint + "\n";
					flag = false;
				}
				String key = (String) iter2.next();
				String expr = (String) invs.get(key);
				tmp = "context " + key + " inv: "
						+ expr.toString().substring(1, expr.length() - 1)
						+ "\n";
				if (!use.contains(tmp))
					use += tmp;
			}
		}
		return use;
	}

	/**
	 * Join source and target model
	 * 
	 * @return A string contains two model
	 */
	private String unionModel() {
		String result = "";
		FileInputStream stream;
		try {
			String mm1 = "", mm2 = "";
			File f1 = new File(fTextModel1.getText());
			stream = new FileInputStream(f1);
			fModel1 = USECompiler.compileSpecification(stream, f1.getName(),
					fLogWriter, new ModelFactory());
			byte[] bytes = Files.readAllBytes(f1.toPath());
			mm1 = new String(bytes, "UTF-8");
			mm1 = mm1.substring(mm1.indexOf(RTLKeyword.startClass));

			File f2 = new File(fTextModel2.getText());
			stream = new FileInputStream(f2);
			fModel2 = USECompiler.compileSpecification(stream, f2.getName(),
					fLogWriter, new ModelFactory());
			bytes = Files.readAllBytes(f2.toPath());
			mm2 = new String(bytes, "UTF-8");
			mm2 = mm2.substring(mm2.indexOf(RTLKeyword.startClass));
			modelName = fModel1.name() + "2" + fModel2.name();
			// All model
			result = RTLKeyword.model + " " + modelName + "\n" + mm1 + "\n"
					+ mm2;
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Parse source and target model
	 */
	private void parseModels() {
		fLogWriter.println("Loading source and target metamodel...");
		String model = unionModel();
		useContent = model;
		fModel = USECompiler.compileSpecification(model, modelName, fLogWriter,
				new ModelFactory());
	}

	/**
	 * Parse TGG rule from .tgg file
	 */
	private void parseTGGRule() {
		fLogWriter.println("Compile TGG rules...");
		FileInputStream specStream;
		try {
			File f = new File(fTextTgg.getText());
			specStream = new FileInputStream(f);
			fTggRules = RTLRuleCompiler.compileSpecification(specStream, f
					.getName(), fLogWriter, fModel);
			System.out.println("OK");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This function writes file model.use
	 */
	private void writeUSEFile() {
		File f = new File(fTextTgg.getText());
		String fTGGsRule = modelName + ".use";
		String path = f.getPath();
		String fullPath = path.substring(0, path.length()
				- f.getName().length());
		fLogWriter.println("Writing USE model specification to file: "
				+ Paths.get(fullPath, fTGGsRule).toString());
		try {
			PrintWriter out = new PrintWriter(new FileWriter(Paths.get(
					fullPath, fTGGsRule).toString()));
			out.print(useContent);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Check valid for path
	 * 
	 * @return
	 */
	private boolean checkPath() {
		File f = new File(fTextModel1.getText());
		if (f.exists()) {
			f = new File(fTextModel2.getText());
			if (f.exists()) {
				f = new File(fTextTgg.getText());
				if (f.exists())
					return true;
			}
		}
		return false;
	}
}
