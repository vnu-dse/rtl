package org.tzi.rtl.tgg.manager;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.tzi.use.config.Options;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.gui.main.ViewFrame;
import org.tzi.rtl.gui.views.diagrams.tgg.tggdiagram.TggDiagramView;
import org.tzi.rtl.tgg.mm.MTggRule;
import org.tzi.rtl.tgg.mm.TggRuleCollection;
import org.tzi.use.util.Log;

import java.util.Collection;
import java.util.Iterator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings({"serial", "unchecked"})
public class RTLRuleTree extends JPanel implements TreeSelectionListener {
	private JEditorPane htmlPane;
	private JTree tree;
	private Collection fTggRules;
	private MainWindow mainWindow;

	//Optionally play with line styles.  Possible values are
	//"Angled" (the default), "Horizontal", and "None".
	private static boolean playWithLineStyle = false;
	private static String lineStyle = "Horizontal";

	//Optionally set the look and feel.
	private static boolean useSystemLookAndFeel = false;

	public RTLRuleTree(TggRuleCollection tggRuleCollection, MainWindow mainWindow) {
		super(new GridLayout(1,0));
		this.fTggRules = tggRuleCollection.getTggRules();
		this.mainWindow = mainWindow;
		
		//Create the nodes.
		DefaultMutableTreeNode top =
				new DefaultMutableTreeNode("Triple Rules");
		createNodes(top);

		//Create a tree that allows one selection at a time.
		tree = new JTree(top);
		tree.getSelectionModel().setSelectionMode
		(TreeSelectionModel.SINGLE_TREE_SELECTION);

		//Listen for when the selection changes.
		tree.addTreeSelectionListener(this);

		if (playWithLineStyle) {
			System.out.println("line style = " + lineStyle);
			tree.putClientProperty("JTree.lineStyle", lineStyle);
		}

		//Create the scroll pane and add the tree to it. 
		JScrollPane treeView = new JScrollPane(tree);

		//Create the HTML viewing pane.
		htmlPane = new JEditorPane();
		htmlPane.setEditable(false);
		htmlPane.setContentType("text/html");
		JScrollPane htmlView = new JScrollPane(htmlPane);

		//Add the scroll panes to a split pane.
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		splitPane.setTopComponent(treeView);
		splitPane.setBottomComponent(htmlView);

		Dimension minimumSize = new Dimension(100, 100);
		htmlView.setMinimumSize(minimumSize);
		treeView.setMinimumSize(minimumSize);
		splitPane.setDividerLocation(200); 
		splitPane.setPreferredSize(new Dimension(300, 500));

		//Add the split pane to this panel.
		add(splitPane);
	}

	/** Required by TreeSelectionListener interface. */
	public void valueChanged(TreeSelectionEvent e) {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)
				tree.getLastSelectedPathComponent();

		if (node == null) return;

		Object nodeInfo = node.getUserObject();
		if (node.isLeaf()) {
			MTggRule tggRule = (MTggRule) nodeInfo;
			String specification = readHTMLFile(tggRule);
			htmlPane.setText(specification);
			
			TggDiagramView tggView = new TggDiagramView(mainWindow, tggRule);
    		tggView.setVisible(true);
    		ViewFrame f = new ViewFrame("Triple rule [" + tggRule.name() + "]", tggView,
    				"Tgg.gif" );
    		try {
				URL url = new URL("jar:" + Options.pluginDir + Options.FILE_SEPARATOR + "RTL.jar!/resources/Tgg.gif");
				ImageIcon icon = new ImageIcon(url);
				f.setFrameIcon(icon);
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		
    		JComponent c = (JComponent) f.getContentPane();
    		c.setLayout(new BorderLayout());
    		c.add(new JScrollPane(tggView, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), 
    								BorderLayout.CENTER);
    		mainWindow.addNewViewFrame(f);
		}
	}
	
	private void createNodes(DefaultMutableTreeNode top) {
		DefaultMutableTreeNode rule = null;
		Iterator it = fTggRules.iterator();
		while(it.hasNext()){
			MTggRule tggRule = (MTggRule) it.next();
			rule = new DefaultMutableTreeNode(tggRule);
			top.add(rule);
		}
	}

	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event dispatch thread.
	 */
	public static void createAndShowGUI(TggRuleCollection tggRules, MainWindow mainWindow) {
		if (useSystemLookAndFeel) {
			try {
				UIManager.setLookAndFeel(
						UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				System.err.println("Couldn't use system look and feel.");
			}
		}

		//Create and set up the window.
		JFrame frame = new JFrame("Restricted Graph Trafo Rules");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		//Add content to the window.
		frame.add(new RTLRuleTree(tggRules, mainWindow));

		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}
	
	private String readHTMLFile(MTggRule tggRule){
		StringWriter sw = new StringWriter();
        sw.write("<html><head>");
        sw.write("<style> <!-- body { font-family: sansserif; } --> </style>");
        sw.write("</head><body><font size=\"-1\">");          
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(tggRule.htmlFile()));
            // read from file
            String readLine = null;                
            do{
            	try {
            		readLine = reader.readLine();
            		//System.out.println(readLine);
            		if (readLine == null) break;
            		if (readLine.matches("^\\s*rule\\s*" + tggRule.name() + "\\s*")){                			
            			while (readLine != null && !readLine.matches("^\\s*}\\s*end\\s*") && !readLine.matches("^\\s*end\\s*")){
            				readLine = readLine.replace(">", "&gt;");
            				readLine = readLine.replace("<", "&lt;");
            				readLine = readLine.replace("rule", "<strong>rule</strong>");
            				readLine = readLine.replace("checkSource", "<strong>checkSource</strong>");
            				readLine = readLine.replace("checkTarget", "<strong>checkTarget</strong>");
            				readLine = readLine.replace("checkCorr", "<strong>checkCorr</strong>");
            				readLine =readLine.replace(" ", "&nbsp;");
            				sw.write(readLine + "<br>");
            				readLine = reader.readLine();
            			}
            			readLine = readLine.replace("end", "<strong>end</strong>");
            			sw.write(readLine);                			
            			readLine = null;//break
            		}
            	} catch (IOException e) {                	
            		e.printStackTrace();                		
            	}
            } while(readLine != null);
        } catch (FileNotFoundException e) {
            Log.error("File `" + tggRule.htmlFile() + "' not found.");
        }           
        
        sw.write("</body></html>");
        String spec = sw.toString();            
        return spec;
	}
}