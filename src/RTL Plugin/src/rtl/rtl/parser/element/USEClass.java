package rtl.parser.element;

import java.util.ArrayList;

import rtl.parser.regex.RTLKeyword;
import rtl.parser.regex.RTLRegex;

public class USEClass {
	String name;
	ArrayList<String> description;
	ArrayList<TGGObject> attributes;
	ArrayList<String> parents;
	
	public USEClass() {
		description = new ArrayList<String>();
		attributes = new ArrayList<TGGObject>();
		parents = new ArrayList<String>();
	}
	
	public USEClass(String name) {
		this.name = name;
		description = new ArrayList<String>();
		attributes = new ArrayList<TGGObject>();
		parents = new ArrayList<String>();
		description.add(RTLKeyword.startClass + RTLRegex.indent(1) + name);
		description.add(RTLKeyword.endClass);
	}
	
	public String toString() {
		String res = "";
		for(int i = 0; i < description.size(); i++)
			res += description.get(i) + "\n";
		return res;
	}
	
	public void appendDescription(String newline) {
		description.add(newline);
	}
	
	/**
	Parser
		class ActivityEdge < Edge, Node
		attributes
  			name : String
  			guard : String
		end
	 */
	public void parser() {
		if(description.size() >= 2) {
			String line = description.get(0);
			String[] s = line.split(" ");
			if(s.length >= 2)
				this.name = s[1];
			if(line.contains("<")) {
				int begin = line.indexOf("<");
				line = line.substring(begin+1).trim();
				line = line.replace(" ", "");
				if(line != null && line.length() > 0) {
					s = line.split(",");
					for(int i = 0; i < s.length; i++)
						parents.add(s[i].trim());
				}
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getParentsType() {
		return parents;
	}
}
