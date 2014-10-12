package org.tzi.rtl.gui.plugins.tgg;

import java.io.PrintWriter;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;
public class ActionAutoMatchForward  implements IPluginActionDelegate {
	//static TggRuleCollection fTggRuleCollection;
	//static List<Matching> result;
	//static Matching currentMatch;
	//static int size = 0;
	//static int step = 0;
	//static boolean mustRematch = true; // after state changed, we have to re-find matches
    Session fSession;
    PrintWriter fLogWriter;
	public ActionAutoMatchForward(){
		
	}

    public ActionAutoMatchForward(Session fSession, PrintWriter fLogWriter) {
        this.fSession = fSession;
        this.fLogWriter = fLogWriter;
    }

    public void performAction() {
        if (fSession != null && fLogWriter != null) {
            fLogWriter.println("++++++++++++++++++++");
            fLogWriter.println("Auto forward trafo...");
            ActionFindAllMatchForward.findAllMatch(fLogWriter, fSession);
            ActionFindAllMatchForward.setStep(-1);
            //step = -1;
            ActionFindAllMatchForward.nextStep(fLogWriter, fSession);
            while (ActionFindAllMatchForward.currentMatch != null){
            	ActionFindAllMatchForward.runMatch(fSession, fLogWriter);
            	//ActionFindAllMatchForward.nextStep(fLogWriter, fSession);
            }
            
            fLogWriter.println("trafo completed.");
        }
    }

	@Override
	public void performAction(IPluginAction pluginAction) {
		fSession = pluginAction.getSession();
		MainWindow window = pluginAction.getParent();
		fLogWriter = window.logWriter();

        performAction();
	}
}
