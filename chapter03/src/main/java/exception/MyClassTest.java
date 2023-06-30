package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		
		try {
			MyClass myClass = new MyClass(); //그나마 보기 쉽게 보일려고 블럭 안에다가 작성하였음
			myClass.danger();
		} catch (IOException e) {
			// TODO Auto-generated catch block 추적이되죠? Console 하이라이트 클릭하면 위치를 알 수 있음; 디버깅
			e.printStackTrace();
		}

	}

}
