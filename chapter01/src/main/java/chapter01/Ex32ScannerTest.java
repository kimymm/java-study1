package chapter01;

import java.util.Scanner; //ctrl + shift + o

public class Ex32ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("상품 정보를 입력하세요");
		
		System.out.print("이름:");
		
//		scanner.next();//블락킹 사용자가 입력할때까지 기다리는
//		System.out.println("안녕?");
		
		String name = scanner.next();
		System.out.print(name);
		
		
		System.out.println("가격:");
		int price = scanner.nextInt();
		
		System.out.println("재고량:");
		int countStock = scanner.nextInt();
		
		System.out.println(name + " : " + price + " : " + countStock);
		//scanner의 20%도 안한 것
		
		
	}

}
