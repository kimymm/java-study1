package chapter03;

import mypackage.Goods2;

public class goods2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods2 g = new Goods2();
		
		//Goods 패키지랑 상호작용
		
		//public은 접근제한이 없다
		g.name = "카메라";
//		g.countStock = 20;
//				//private는 
//		g.countSold = 10;
//		
//		//protected는
//		// 1. 같은 패키지에서만 접근할 수 있다.
//		// 2. 더 중요한 것은 자식에서 접근 가능하게 함
//		g.price = 1000;
//		
//		//default는 같은 패키지에서만 접근할 수 있다.
//		g.countStock = 20000;
		System.out.println();
		
	}

}
