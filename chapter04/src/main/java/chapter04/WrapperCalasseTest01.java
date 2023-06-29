package chapter04;

public class WrapperCalasseTest01 {

	public static void main(String[] args) {
		// deprecated
		Integer i = new Integer(10); //이제 안쓴다.
		
		
		// Auto Boxing 자동으로 객체를 씌워주는것
		Integer i2 = 10;
		Long l = 10L;
		
		System.out.println(i2.equals(10)); //객체가 들어가야하는데 10이라니 자동으로 되는걸 auto Boxing이라
		
		// auto unboxing
		System.out.println(i2 == 10);
		System.out.println(i2.intValue() == 10);
		
		int m = i2 + 10; //auto unboxing 기본값처럼 취급해도 된다.
		//int m = i2.intValue() + 10;
	}

}
