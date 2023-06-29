package chapter04;

public class StringTest01 {
	public static void main(String[] args) {
		// c:\temp을 출력하고싶어요 유닉스 기반 맥도 유닉스죠 윈도우는 
		// linux는 /home/kym/practice
		// c: \home\kym		디렉토리쓸때는 유닉스방식으로 적어야함 드라이브 이름도 적으면 안됨
		System.out.println("c:\\temp" ); //드라이브 이름을 적는다면 대부분 리눅스로돌릴텐데 문제가 될 수 있다. : 드라이브 이름 빼면
										//역슬래시는 특수문자를 \r은 캐리지 리턴: 잉크담고있는 타자기움직이는 , 리턴이 가면 맨 앞에 가는것
										//사실 \n와 \r가 합쳐야 줄바꿈이 되는 것이었는데. 지금은 구분이 없다
										// \b는 에러나면 울리는 문자. 윈도우는x
		// \t:tab, \r: carriage return, \n: newline, \b: beep
		
		System.out.println("\"hello\""); // 스트링 리터럴이 아니라 . 변수?
		
		// '만 출력
		char c = '\'';
		System.out.println(c);

	}

}
