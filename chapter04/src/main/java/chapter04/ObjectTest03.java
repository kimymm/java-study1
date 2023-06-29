package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);  //false 뒤에 따르는 객체가 없고, 오버라이딩도 없고
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode() + ":" + s2.hashCode()); //override, s1,s2해시코드가 같음, 내용기반
		System.out.println(System.identityHashCode(s2) + ":" + System.identityHashCode(s1)); //볼수 있는방법 이해는 안가요 s
		
		System.out.println("===========================================");
		
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(s3 == s4);  //이게 false이어야하지
		System.out.println(s3.equals(s4)); 
		System.out.println(s3.hashCode() + ":" + s4.hashCode()); 
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4)); // 주소기반의 해시코드,같은객체
		
		
	}

}
