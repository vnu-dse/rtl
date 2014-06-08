package org.tzi.rtl.gui.plugins.tgg;

import java.io.PrintWriter;

import org.tzi.rtl.trafo.matching.Matching;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;

public class ActionNextMatchForward  implements IPluginActionDelegate {
	Matching currentMatch;
	public ActionNextMatchForward(){
		
	}

	@Override
	public void performAction(IPluginAction pluginAction) {
		MainWindow fMainWindow = pluginAction.getParent();
		PrintWriter fLogWriter = fMainWindow.logWriter();
		Session fSession = pluginAction.getSession();
		ActionFindAllMatchForward.nextStep(fLogWriter, fSession);
	}
}
