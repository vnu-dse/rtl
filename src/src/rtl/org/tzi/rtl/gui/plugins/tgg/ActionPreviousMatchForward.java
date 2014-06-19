package org.tzi.rtl.gui.plugins.tgg;

import java.io.PrintWriter;

import org.tzi.rtl.trafo.matching.Matching;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;

public class ActionPreviousMatchForward  implements IPluginActionDelegate {
	Matching currentMatch;
    Session fSession;
    PrintWriter fLogWriter;

	public ActionPreviousMatchForward(){
		
	}

    public ActionPreviousMatchForward(Session session, PrintWriter writer) {
        this.fSession = session;
        this.fLogWriter = writer;
    }

    public void performAction() {
        if (fSession != null && fLogWriter != null) {
            fLogWriter.println("++++++++++++++++++++");
            fLogWriter.println("Run previous match forward ...");
            ActionFindAllMatchForward.previousStep(fLogWriter, fSession);
            fLogWriter.println("Done.");
        }
    }

	@Override
	public void performAction(IPluginAction pluginAction) {
		MainWindow window = pluginAction.getParent();
		fSession = pluginAction.getSession();
		fLogWriter = window.logWriter();

        performAction();
	}
}
