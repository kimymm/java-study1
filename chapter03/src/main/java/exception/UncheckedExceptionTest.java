package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		// unchecked Exception은 예외처리(try catch)없이 발생해야한다. -> 고쳐라
		// 왜? 예외를 보고 수정해야하는 예외라기 보다는 로직 에러에 가깝기 떄문이다.
		// ArrayIndexOutofBoundsException
		// ArithMeticException
		// NullPointException 객체가 비웠는데 호출하는 행위에서
		
		int[] a = {1, 2, 3, 4, 5};
		
//		try{} xxxxxxxxxxxxxxxxxx
		for(int i =0; i <= a.length; i++) { // 이러다 갑자기 잘못짰어
			System.out.println(a[i]); //out of bound가 나는 예외이군 -------------------------> 내가 prac하다가 오류났었죠????
										//나는 완벽하게 짰는데 에러가 났는것 try catch 보다 언릉 고치는게 우선.
										//이런 exception은 try catch를 안하지요
											// '=' 을 고치면 됩니다. logical error 이런건 try catch하는것이 아니다.
										//try catch안나오는 간결한 코드가 좋은 것임 . spring은 코드상에서 없앨려고 
		}						

	}

}
