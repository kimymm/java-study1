package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int sum = 0;
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		for(int i = num % 2; i <= num; i+=2) {
			sum += i;
		}
		System.out.println("결과 값: " + sum);
		scanner.close();
	}
}
