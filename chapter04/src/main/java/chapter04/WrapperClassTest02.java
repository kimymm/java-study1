package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		String s1 = "1234"; //웹에서 왔다갔다하는 것은 String
		int i = Integer.parseInt(s1); // 
		
		//cf1
		String s2 = String.valueOf(i);
		
		//cf2
		String s3 = "" + i; //stringbuffer을 생성해야함
		
		System.out.println(s1 + ":" + s2 + ":" + s3);
		
		char c = 'A';
		int i2 = Character.getNumericValue(c);
		System.out.println(i2); //hex
		
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4); ///1111 = 15
		
		//16진수
		String s5 = Integer.toHexString(15);
		System.out.println(s5);
		
		
	}

}
