package prob04;

public class StringUtil {
	public static String concatenate( String[] str ) {
		String text = "";
		
		for (int i = 0; i < str.length; i++) {
			text+=str[i].toString();
		}
		
		return text;
	}
	
}
