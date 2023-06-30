package exception;

public class MyClass {
	public void danger() throws MyException {
		System.out.println("Some code1");
		
		
		//여기에 뭔 상황이 생김
		if(1-1 ==0) {
		throw new MyException();
		}
		
		System.out.println("Some code2"); //이거 안되
	}
}
