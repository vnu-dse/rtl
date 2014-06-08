package rtl.parser.element;

import java.util.ArrayList;

import rtl.parser.main.TGGParser;

public class USEAssociation {
	ArrayList<String> description;
	ArrayList<USEMultiplicity> multiplicities;
	String name;
	
	public USEAssociation() {
		this.name = "";
		description = new ArrayList<String>();
		multiplicities = new ArrayList<USEMultiplicity>();
	}
	
	/**
	Parser
		association ConnectsFrom between
  			ActivityEdge[0..*] role outEdge
  			ActivityNode[0..1] role source
		end
	 */
	public void parser() {
		multiplicities.clear();
		if(description.size() > 2) {
			String line = description.get(0);
			String[] s = line.split(" ");
			if(s.length >= 2)
				this.name = s[1];
			for(int i = 1; i < description.size() - 1; i++) {
				line = description.get(i);
				/**
				 * Parser input to USEMultiplicity:	ProcessAssignment[0..*] role process
				 */
				if(line.contains("role")) {
					USEMultiplicity m = USEMultiplicity.parser(line.trim());
					multiplicities.add(m);
				}
			}
		}
	}
	
	public String toString() {
		String res = "";
		for(int i = 0; i < description.size(); i++)
			res += description.get(i) + "\n";
		return res;
	}
	
	public void appendDescription(String newline) {
		this.description.add(newline);
	}
	
	public void setDescription(ArrayList<String> description) {
		this.description.addAll(description);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String getRoleName(String typeObject, boolean more) {
		USEMultiplicity m;
		String range = "[1..1]";
		for(int i = 0; i < multiplicities.size(); i++) {
			m = multiplicities.get(i);
			if(more) {
				if(m.typeObject.equals(typeObject) && m.range.equals(range))
					return m.roleName;
			} else if(m.typeObject.equals(typeObject))
				return m.roleName;
		}
		USEClass c = TGGParser.searchUSEClass(typeObject);
		ArrayList<String> parents = getAllParentForClass(c);
		if(parents == null)
			return null;
		for(int i = 0; i < parents.size(); i++) {
			for(int j = 0; j < multiplicities.size(); j++) {
				m = multiplicities.get(j);
				if(more) {
					if(m.range.equals(range) && m.typeObject.equals(parents.get(i).trim()))
						return m.roleName;
				} else if(m.typeObject.equals(parents.get(i).trim()))
					return m.roleName;
			}
		}
		return null;
	}
	
	public ArrayList<String> getAllParentForClass(USEClass c) {
		ArrayList<String> parents = c.parents;
		if(parents.size() == 0)
			return null;
		ArrayList<String> tmp;
		USEClass uc;
		for(int i = 0; i < parents.size(); i++) {
			String type = parents.get(i);
			uc = TGGParser.searchUSEClass(type);
			if(uc != null) {
				tmp = uc.parents;
				if(tmp.size() > 0)
					parents.addAll(tmp);
			}
		}
		return parents;
	}
}
