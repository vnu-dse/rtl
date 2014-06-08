package rtl.parser.element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rtl.parser.regex.RTLRegex;

public class TGGInvariant {
	public String name;
	public String invariant;
	public TGGInvariant(String name, String invariant) {
		this.name = name;
		this.invariant = invariant;
	}
	
	/**
	 * 
	 * @param input:	AC2E:[self.event.name=self.act.name]
	 * @return TGGInvariant
	 */
	public static TGGInvariant parser(String input) {
		Pattern p = Pattern.compile(RTLRegex.InvariantRegex);
		Matcher m = p.matcher(input);
		if(m.find()) {
			String g1, g2, g3;
			g1 = m.group(1);
			g2 = m.group(2);
			g3 = m.group(3);
			return new TGGInvariant(g1, g2 + "=" + g3);
		} else
			return null;
	}
	
	public String toString() {
		return "context " + name + " inv: " + invariant;
	}
	
	public boolean equals(TGGInvariant i) {
		if(this.name.equals(i.name) && this.invariant.equals(i.invariant))
			return true;
		else
			return false;
	}
}
