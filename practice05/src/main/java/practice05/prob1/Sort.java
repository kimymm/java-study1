package prob1;

public class Sort {
	
	public static void main(String[] arg) { //버블정렬 학교에서 배웠죠 앞에 하나 두개 바꿔치기 그다음거 바꿔치기...
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 }; //졸라쉽겠죠 버블 구현을 제어문으로 구현 하면되지않나?
		int count =  array.length;					//근데 이게 어째 oop이에요?
													//근데 큰순서대로..? 두번에 걸쳐서 다시 정렬하면 되나 보군..
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		// 아 알고리즘이 이거구나. 문제에 설명도 있으니 참조
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//

		
		// 결과 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}		
	}
}