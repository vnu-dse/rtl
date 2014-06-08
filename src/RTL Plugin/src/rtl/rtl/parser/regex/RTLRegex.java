package rtl.parser.regex;

public class RTLRegex {
	//	Parser:	theActivityEdgeA: ActivityEdge
	public static String ObjectRegex = "^([a-zA-Z0-9\\_]+)\\s*:\\s*([a-zA-Z0-9\\_]+)$";
	//	Parser:	(theActivityEdgeA, init): ConnectsFrom
	public static String LinkRegex = "^\\(([a-zA-Z0-9\\_]+)\\s*,\\s*([a-zA-Z0-9\\_]+)\\)\\s*:\\s*([a-zA-Z0-9\\_]+)$";
	//	Parser:	[SKIP.name = 'SKIP']
	public static String OCLAttributeRegex = "^\\[([a-zA-Z0-9\\_]+).([a-zA-Z0-9\\'\\_\\.\\-\\>\\(\\)\\=\\s]+)\\]$";
	//	Parser: [theActivityEdgeC.name<>oclUndefined(String)]
	public static String OCLCoditionRegex = "^\\[([a-zA-Z0-9.\\_]+)<>oclUndefined\\(([a-zA-Z0-9\\_]+)\\)\\]$";
	//	Parser:	(theActivityEdgeC,condition2) as (ae,con) in ae2con2:AE2CON
	public static String CorrLinkRegex = "^\\(([a-zA-Z0-9\\_]+)\\s*,\\s*([a-zA-Z0-9\\_]+)\\)\\s*as\\s*" +
			"\\(([a-zA-Z0-9\\_]+)\\s*,\\s*([a-zA-Z0-9\\_]+)\\)\\s*in\\s*" +
			"([a-zA-Z0-9\\_]+)\\s*:\\s*([a-zA-Z0-9\\_]+)$";
	//	Parser:	AE2CON:[self.con.expression=self.ae.guard]
	public static String InvariantRegex = "^([a-zA-Z0-9\\_]+)\\s*:\\s*\\[([a-zA-Z0-9.\\_]+)\\s*=\\s*([a-zA-Z0-9.\\_]+)\\]$";
	//	Parser:	ProcessAssignment[0.,.*] role process
	public static String Multiplicity = "^([a-zA-Z0-9\\_]+)([\\[,.0-9*\\]]+)\\s*(role)\\s*([a-zA-Z0-9\\_]+)$";
	
	public static String comment(int number, Character c) {
		if(number <= 0)
			return "";
		String spaces = new String(new char[number]).replace('\0', c);
		return spaces;
	}
	
	public static String indent(int number) {
		if(number <= 0)
			return "";
		String spaces = new String(new char[number]).replace('\0', ' ');
		return spaces;
	}
	
	public static String insertUnderscore(String input) {
		if(input.startsWith("_"))
			return input;
		else
			return "_" + input;
	}
}
