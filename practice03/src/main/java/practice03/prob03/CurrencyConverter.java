package practice03.prob03;

public class CurrencyConverter {
	private double rate;
	public static void setRate(double rate) {//왜 static메소드를 사용?
	}//i have no idea

	public static double toDollar(double d) {
		return d / rate;
	}

	public static double toKRW(double d) {
		return d * rate;
	}
	
	
	
	
}
