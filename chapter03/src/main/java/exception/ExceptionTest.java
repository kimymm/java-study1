package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		//일부러 예외일으킬 것임, 내가 랜선 뽑을 수는 없
		int a = 10;
		int b=  10 - a;
		
		System.out.println("some code1");
		
		//이런 문법!
		try {
			System.out.println("some code2");
			
			int result = (1 + 2 + 3 ) / b; //divide by zero
			
			System.out.println("some code3");
			System.out.println("some code4");

		} catch(ArithmeticException ex) { //int b = 11 - a; 이면 이 블록 실행하지 않죠
			ex.printStackTrace(); // 적을 줄 모르면 이거라도 적어놔라
			//예외가 발생하면 일로 들어옴
			/* 예외 처리 */
			// 1. 사과
			System.out.println("미안ㅋ.");
			//사용자게게 이런 빨간색 줄을 보여줘서는 안된다. 절대 서비스 쓸 생각 안함.
			//2. 로깅, 로그를 남겨야함. 그냥 넘어가면 이거 지켜보는 있는 것도 아니고 남겨야 나중에 예외가 생긴걸 알 수 있으니까
			// 서버에서는 화면이 없다, sk브로드뭐요? 그게 여기 근처에 있다노. 페이스북은 아일랜드에 있다고, 가지 않는 이상 파일을 뒤져서 확인해야한다.
			// 이걸 화면에 출력하면 안됨
			System.out.println("error!" + ex); //예외처리는 정해져 있다!
			
			//3. 정상적인 종료
			return; //main함수니까 return나오면 끝나기 때문
			
			//가끔 회사에서 catch본문을 비워놓는데 실행하면 아무 흔적도 없이 그냥 실행되버리고 예외가 발생하는지 사용자도 모름 : 가장 나쁜 환경
			//만일 catch블락을 비워두는 동료가 있으면 그냥 손절
			//우리 회사는 예외처리는 어떻게 하나요. 함수를 써라는 등, 로깅부분이 좀변형되있거나, 
			//공부 열
			
		} finally {
			System.out.println("자원 정리"); // 자원정리 코드  블락 밖으로 빼서 자원 정리는 또 좋지 않다오
		}
		//예외가 발생한 이후에 실행할 가능성이 있는 코드 이기 때문에 비추 some code4에서 끝내야 좋음
//		System.out.println("some code5"); 왜 하지말라는거지? 왜냐 catch안에 오류 있는거  다 했는데 그 다음에 또 오류가 발생할수 있는 가능성을 하나 만드는 것과 같다.

	}

}
