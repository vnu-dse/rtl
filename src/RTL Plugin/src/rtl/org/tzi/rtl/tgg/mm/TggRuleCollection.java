/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package org.tzi.rtl.tgg.mm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * ...
 *
 * @version     $ProjectVersion: 0.393 $
 * @author      hanhdd 
 */

@SuppressWarnings({"unchecked"})
public class TggRuleCollection {
	/**
	 * @uml.property  name="fTggRules"
	 * @uml.associationEnd  qualifier="name:java.lang.String org.tzi.use.gratra.MTggRule"
	 */
	private Map fTggRules;
	private Map fTggRuleApplications;
    private String fName;
	
	public TggRuleCollection(){
		fTggRules = new TreeMap();
		fTggRuleApplications = new TreeMap();
	}

    public TggRuleCollection(String fName) {
        fTggRules = new TreeMap();
        fTggRuleApplications = new TreeMap();
        this.fName = fName;
    }
    
    //public void setTggRuleFileName(String tggRuleFileName){
    	//fTggRuleFileName = tggRuleFileName;
    //}
    
    public Collection getTggRuleApplications(){
    	return fTggRuleApplications.values();
    }
    
    public Collection getTggRules(){
    	return fTggRules.values();
    }
    
    public Collection getTggRuleNames(){
    	Collection res = new ArrayList();
    	Iterator it = fTggRules.values().iterator();
    	while(it.hasNext()){
    		MTggRule tggRule = (MTggRule) it.next();
    		res.add(tggRule.name());
    	}
    	return res;
    }
    
    public void addTggRuleApplication(MTggRuleMatch tggRuleApp) {
    	fTggRuleApplications.put(tggRuleApp.getMatchID(),tggRuleApp);
	}
    
	public void addTggRule(MTggRule tggRule) {
		// TODO Auto-generated method stub
		fTggRules.put(tggRule.name(),tggRule);
	}
    
	public void setHTMLFile(String htmlFile) {
		Map alterTggRules = new TreeMap();
		Iterator it = fTggRules.values().iterator();
		while(it.hasNext()){
			MTggRule tggRule = (MTggRule) it.next();
			tggRule.setfHTMLFile(htmlFile);
			alterTggRules.put(tggRule.name(), tggRule);
		}
		fTggRules.clear();
		fTggRules = alterTggRules;
	}

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }
    
    public Map<String, Object> genAllCorrInvariant(){
    	Map<String, Object> invs = new HashMap<String, Object>();
    	for (Iterator iter = getTggRules().iterator(); iter.hasNext();) {
			MTggRule tgg = (MTggRule) iter.next();
			invs.putAll(tgg.genCorrInvariant());
		}
    	return invs;
    }
}
