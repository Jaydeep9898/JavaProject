package helper;
import java.util.regex.*;
public class RegularExpressionValidator {
	
	public RegularExpressionValidator() {
		
	}
	
	public static boolean isStringOnlyAlphabet(String str) {
		return ((str != null)&&(!str.equals(""))&&(str.matches("^[a-zA-Z]*$")));
	}
	
	public static boolean isValidNumber(String str) {
		Pattern p = Pattern.compile("^(\\d{10})|(([\\(]?([0-9]{3})[\\)]?)?[ \\.\\-]?([0-9]{3})[ \\.\\-]([0-9]{4}))$");
		Matcher m = p.matcher(str);
		return (m.find()&&m.group().equals(str));
	}
	
	public static boolean isValidPostalCode(String str) {
		Pattern p = Pattern.compile("^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$");
		Matcher m = p.matcher(str);
		return (m.find()&&m.group().equals(str));
	}
	
	public static boolean isValidVisa(String str) {
		Pattern p = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
		Matcher m = p.matcher(str);
		return (m.find()&&m.group().equals(str));
	}
	
	public static boolean isValidMasterCard(String str) {
		Pattern p = Pattern.compile("^5[1-5][0-9]{14}$");
		Matcher m = p.matcher(str);
		return (m.find()&&m.group().equals(str));
	}
	
	public static boolean isValidAmericanExpress(String str) {
		Pattern p = Pattern.compile("^3[47][0-9]{13}$");
		Matcher m = p.matcher(str);
		return (m.find()&&m.group().equals(str));
	}
	
	public static boolean isEmail(String str) {
		Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher m = p.matcher(str);
		return (m.find()&&m.group().equals(str));
	}
}
