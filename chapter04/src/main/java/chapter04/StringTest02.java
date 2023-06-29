package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		System.out.println(s1.toUpperCase()); //불변이라 s1의 값이 바뀌는 것이 아니다.
		
		s2 = s1.toUpperCase();
		System.out.println(s2);
		
		String s4 = s2.concat("??");
		System.out.println(s4);
		
		String s5 = "1".concat(s2).concat("@"); // String s = "1"; s.concat(s2)와 같은 것. 근데 이건 변수로 정했다는 것은 계속 쓴다는 거죠
												//따라서 더 효율적인 코드인거지. 이상한 것이 아님 "1" 객체가 생기는 것임.
		System.out.println(s5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		String s6 = "hello"; //애가 null일 수도 있지 .s.equals()는 nullPointerException
		System.out.println(equalsHello(s6)); //이럼
										

	}
	
	public static boolean equalsHello(String s) { //이 string이 hello랑 같은지
		return s.equals("hello"); //10명중 2,3명은 이렇게 짤텐데이러면 s6이 null이면 nullPointerException이 나오기때문에
		//return "Hello".equals(s) 하면 nullPointerException은 나오지 않는다.
		
	}

}
