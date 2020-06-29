package interviewPrograms;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		String str = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
		System.out.println(str+" is the original string and the string after removing spaces is "+removeSpacesBuiltInMethod(str));
		System.out.println(str+" is the original string and the string after removing spaces is "+removeSpaces(str));
	}
	public static String removeSpaces(String str) {
		String str1 = "";
		char[] chars = str.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(chars[i]!=' '&&chars[i]!='\t') {
				str1 = str1+chars[i];
			}
		}
		return str1;
	}
	public static String removeSpacesBuiltInMethod(String str) {
		return str.replaceAll("\\s","");
	}
}
