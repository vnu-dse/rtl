package rtl.parser.element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rtl.parser.regex.RTLRegex;

public class USEMultiplicity {
	String range;
	String typeObject;
	String roleName;
	public USEMultiplicity() {
		this.range = null;
		this.typeObject = null;
		this.roleName = null;
	}
	
	public USEMultiplicity(String typeObject, String roleName, String range) {
		this.range = range;
		this.roleName = roleName;
		this.typeObject = typeObject;
	}
	
	public String toString() {
		return typeObject + range + " role " + roleName;
	}
	
	/**
	 * 
	 * @param input:	BinaryOperator[0..1] role binaryOperatorRight
	 * We use regrex:	^([a-zA-Z0-9\\_]+)([\\[,.0-9*\\]]+)\\s*(role)\\s*([a-zA-Z0-9\\_]+)$
	 * @return
	 */
	public static USEMultiplicity parser(String input) {
		Pattern p = Pattern.compile(RTLRegex.Multiplicity);

		// Now create matcher object.
		Matcher m = p.matcher(input);
		if(m.find()) {
			String range, typeObject, roleName;
			typeObject = m.group(1);
			range = m.group(2);
			roleName = m.group(4);
			return new USEMultiplicity(typeObject, roleName, range);
		} else
			return null;
	}
}
