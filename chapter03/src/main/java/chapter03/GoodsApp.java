package chapter03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		System.out.println("상품 갯수:" + Goods.countOfGoods);
		camera.setName("nikon");
		camera.setPrice(40000000);
		camera.setCounterStock(20);
		camera.setCounterSold(40);
		
		System.out.println("이름: " + camera.getName());
		System.out.println("가격: " + camera.getPrice());
		System.out.println("재고: " + camera.getCounterStock());
		System.out.println("판매량: " + camera.getCounterSold());
		
		
		Goods goods2 = new Goods();
		System.out.println("상품 갯수: " + Goods.countOfGoods);
		
		
		
		
		Goods tv = new Goods("TV", 1000, 10, 50);
	}
}
