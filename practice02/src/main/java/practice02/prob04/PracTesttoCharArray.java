package practice02.prob04;

public class PracTesttoCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("hello world");
		char[] result = str.toCharArray(); // {'h', 'e', 'l' ....}동일
		result[0] = result[2];
		
		
		for(int i =0; i < result.length; i++) {
			System.out.print(result);
		}
		
		
	}

}
