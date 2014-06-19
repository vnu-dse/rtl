package org.tzi.rtl.gui.plugins.tgg;

import org.tzi.rtl.gui.views.forms.tgg.RTLParserParameter;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;


/**
 * RTL1.1
 * @author Khoa-Hai Nguyen
 *
 */
public class ActionParserRTL implements IPluginActionDelegate {
	private RTLParserParameter fParamForm;
	
	public ActionParserRTL() {
		
	}
	public void performAction(IPluginAction pluginAction) {
		Session fSession = pluginAction.getSession();
		MainWindow fMainWindow = pluginAction.getParent();
		fParamForm = new RTLParserParameter(fSession, fMainWindow);
        fParamForm.setVisible(true);
	}

    public RTLParserParameter getRTLParams() {
        return fParamForm;
    }

}
