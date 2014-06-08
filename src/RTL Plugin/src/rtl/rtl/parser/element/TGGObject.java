package rtl.parser.element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rtl.parser.regex.RTLRegex;

public class TGGObject {
	String name;
	String type;
	
	public TGGObject(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param input:	action: Action
	 * @return	TGGObject
	 */
	public static TGGObject parser(String input) {
		Pattern p = Pattern.compile(RTLRegex.ObjectRegex);
		Matcher m = p.matcher(input);
		if(m.find()) {
			String name, type;
			name = m.group(1);
			type = m.group(2);
			return new TGGObject(name, type);
		} else
			return null;
	}
}
