package org.tzi.rtl.gui.plugins.tgg;

import org.tzi.use.runtime.IPlugin;
import org.tzi.use.runtime.IPluginRuntime;
import org.tzi.use.runtime.impl.Plugin;

public class RTLPlugin extends Plugin implements IPlugin {

    final protected String PLUGIN_ID = "RestrictedGraphTrafoPlugin";
    
    public String getName() {
	return this.PLUGIN_ID;
    }

    public void run(IPluginRuntime pluginRuntime) throws Exception {
    	
    }

}
