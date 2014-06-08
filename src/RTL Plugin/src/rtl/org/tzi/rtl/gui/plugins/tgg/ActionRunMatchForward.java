package org.tzi.rtl.gui.plugins.tgg;

import java.io.PrintWriter;

import org.tzi.rtl.trafo.matching.Matching;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;

public class ActionRunMatchForward  implements IPluginActionDelegate {
	Matching currentMatch;
	public ActionRunMatchForward(){
		
	}

	@Override
	public void performAction(IPluginAction pluginAction) {
		MainWindow fMainWindow = pluginAction.getParent();
		PrintWriter fLogWriter = fMainWindow.logWriter();
		ActionFindAllMatchForward.runMatch(fLogWriter);
	}
}
