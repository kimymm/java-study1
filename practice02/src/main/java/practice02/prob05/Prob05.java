package practice02.prob05;

import java.util.Random; //랜덤 0~1말하는 걸까?
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		while( true ) {
			
			/* 게임 작성 */
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			int min = 1; int max = 100; int count = 1;
			while(true) {
				System.out.print(min + "-" + max + "\n" + count + ">>");
				int number = scanner.nextInt();
				if(number == correctNumber) {
					System.out.println("맞았습니다.");
					break;
				} else if(number > correctNumber){
					System.out.println("더 낮게");
					max = number;
					count++;
				} else {
					System.out.println("더 높게");
					min = number;
					count++;
				}
			}
			
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		
		scanner.close();
	}

}