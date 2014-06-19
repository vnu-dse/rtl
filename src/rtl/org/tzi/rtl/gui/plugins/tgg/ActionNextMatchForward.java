package org.tzi.rtl.gui.plugins.tgg;

import java.io.PrintWriter;

import org.tzi.rtl.trafo.matching.Matching;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;

public class ActionNextMatchForward  implements IPluginActionDelegate {
	Matching currentMatch;
    Session fSession;
    PrintWriter fLogWriter;

	public ActionNextMatchForward(){
		
	}

    public ActionNextMatchForward(Session session, PrintWriter writer) {
        this.fSession = session;
        this.fLogWriter = writer;
    }

	@Override
	public void performAction(IPluginAction pluginAction) {
		MainWindow window = pluginAction.getParent();
		fLogWriter = window.logWriter();
		fSession = pluginAction.getSession();

        performAction();
	}

    public void performAction() {
        if (fSession != null && fLogWriter != null) {
            fLogWriter.println("++++++++++++++++++++");
            fLogWriter.println("Find all match forward ...");
            ActionFindAllMatchForward.nextStep(fLogWriter, fSession);
            fLogWriter.println("Done.");
        }
    }
}
