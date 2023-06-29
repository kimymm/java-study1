package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
		//String 연산 + 주의할점
		String s1 = "Hello" +  " World " + "Java" + 17;
		//아래와 같은 코드
		StringBuffer sb = new StringBuffer("Hello "); //StringBuffer은 불변이 아님
		sb.append(" World ").append("Java ").append(17); //제이쿼리같은 메소드 체인
		//또는 아래와 또 같은 코드
		String s2 = new StringBuffer("Hello ")
		.append(" World ")
		.append("Java ")
		.append(17)
		.toString();
		
		System.out.println(s1); //객체끼리 어떻게 더하지?
		
		//+연산을 쓰지 말아야할 
//		String s3 = "";
//		for(int i =0; i<1000000; i++) {
//			s3 = s3 + i; //안끝나 String 더하기 가 가능해? "java " +17 처럼
//			//cpu가 어떤 메모리 블락을 할당할때 리턴하다 할당하다 -> 10만번 객체를 생성하고 있는 중이다.
//			//또 누군가 찾아온다. html을 +연산으로 실행하고 있던거였어
//			//s3 = new StringBuffer(s2).append(i).toString();
//		}
		
//		StringBuffer sc = new StringBuffer("");
//		for(int i = 0; i < 10; i++) {
//			sb.append(i); //메소드 호출은 빠르다
//		}
//		String s4 = sb.toString();
//		System.out.println(s4.length());
		
	}

}
