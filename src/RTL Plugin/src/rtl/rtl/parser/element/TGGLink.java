package rtl.parser.element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rtl.parser.regex.RTLRegex;

public class TGGLink {
	String objectA;
	String objectB;
	String type;
	
	public TGGLink(String objectA, String objectB, String type) {
		this.objectA = objectA;
		this.objectB = objectB;
		this.type = type;
	}
	
	public TGGLink() {
		
	}

	public String getObjectA() {
		return objectA;
	}

	public void setObjectA(String objectA) {
		this.objectA = objectA;
	}

	public String getObjectB() {
		return objectB;
	}

	public void setObjectB(String objectB) {
		this.objectB = objectB;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 
	 * @param input: (theActivityEdgeA, finalNode): ConnectsTo
	 * @return TGGLink
	 */
	public static TGGLink parser(String input) {
		Pattern p = Pattern.compile(RTLRegex.LinkRegex);
		Matcher m = p.matcher(input);
		if(m.find()){
			TGGLink link = new TGGLink();
			link.setObjectA(m.group(1));
			link.setObjectB(m.group(2));
			link.setType(m.group(3));
			return link;
		} else
			return null;
	}
}
