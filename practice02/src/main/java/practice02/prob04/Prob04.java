package practice02.prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 ); //배열 c1 출력
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) { // str = "Hello world"
		char[] result = str.toCharArray(); // 문자열을 배열로 만드는 거로구나.
		/* 코드를 완성합니다 */
		for(int i = 0; i < result.length; i++) {
			result[i] = result[result.length-i];
		}
		return result;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println( array ); // c1을 출력하면 풀 배열나열한게 나와??
	}
}