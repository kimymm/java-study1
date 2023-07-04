package practice05.prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  array.length;					
													
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		while(true) {
			int temp;
			int counter = 0;
			for(int i = 0; i < count-1; i++)
				if(array[i] > array[i+1] ) {
					counter++;						//counter가 6번이 넘으면 더이상 바꿔치기 할 필요가 없기때문에 break으로 나가준다
				} else if(array[i] < array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			if(counter == 6) {
				break;
			}
		}
				
		// 결과 출력
		System.out.println( "\nAfter Sort." );

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}		
	}
}