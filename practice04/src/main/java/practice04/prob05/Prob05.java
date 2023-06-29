package prob05;

public class Prob05 {

	public static void main(String[] args) {
		Base base = new MyBase();

		base.service("낮");
		base.service("밤");
		base.service("오후");//순서가 왜 낮 night night 인지, 오버라이드를 해서 출력 
	}
}
