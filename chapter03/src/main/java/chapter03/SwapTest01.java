package chapter03;

public class SwapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		swap(a,b);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	
	}
	
	public static void swap(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
	}// 안바뀌는 이유는? 값으로 전달이라.

}
