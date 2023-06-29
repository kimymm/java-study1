package prob02;

import java.util.Scanner; //Goods 클래스 하나 만들어야함.거기서 클래스 사용할 것이없는걸..

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS]; //3개의 배열이 들어간 객체배열

		// 상품 입력
		for(int i=0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine(); // next, nextline : 한줄씩 받는것
			String[] info = line.split(" "); //" "분할하여 따로 저장
			
			String name = info[0]; // 여기서 이미 초기화 했는데..?
			int price = Integer.parseInt(info[1]);
			int count = Integer.parseInt(info[2]); 
			
			
			//setter, getter
//			System.out.println(line);
		}
		// 상품 출력
		System.out.println(name + "(가격:" + price + "원)이 " + count + "개 입고 되었습니다.");
		// 자원정리
		scanner.close();
	}
}
