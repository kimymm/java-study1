package practice03.prob04;

public class StringUtil {
	private static String str;
	public static String concatenate(String[] strArr) {
//		str = String.join("", strArr);
		for(int i=0; i < strArr.length; i++) {
			str += strArr[i];
		}
		return str;
	}
}
