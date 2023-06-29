package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		int price = 0;
		System.out.println("금액: ");
		price = scanner.nextInt();
		
		if(price >= MONEYS[0]) {
			//price / MONEYS[0] == 
			//price / MONEYS[1] == 
			//price / MONEYS[2] == 
			//price / MONEYS[3] == 
		}
		scanner.close();
 	}
}