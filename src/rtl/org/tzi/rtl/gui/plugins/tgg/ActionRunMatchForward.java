package org.tzi.rtl.gui.plugins.tgg;

import org.tzi.rtl.trafo.matching.Matching;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;

import java.io.PrintWriter;

public class ActionRunMatchForward  implements IPluginActionDelegate {
	Matching currentMatch;
    PrintWriter fLogWriter;
    Session fSession;

	public ActionRunMatchForward(){
		
	}

    public ActionRunMatchForward(Session _fSession, PrintWriter writer) {
        fLogWriter = writer;
        fSession = _fSession;
    }

    public void performAction() {
        fLogWriter.println("++++++++++++++++++++");
        fLogWriter.println("Run match forward ...");
        ActionFindAllMatchForward.runMatch(fSession,fLogWriter);
        fLogWriter.println("Done.");
    }

	@Override
	public void performAction(IPluginAction pluginAction) {
		MainWindow window = pluginAction.getParent();
		fLogWriter = window.logWriter();

        performAction();
	}
}
