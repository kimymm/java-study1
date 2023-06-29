package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	//자식접근 
	private float discountRate = 0.3f;
	public int getDiscountPrice() {
		return (int)( price * discountRate);
		// 자식이 접근 가능하자. interface/ super
	}
}
