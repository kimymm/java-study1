package exception;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyException() {
		super(" "); //부모에 메세지를 넣는것
	}
	public MyException(String msg) {
		super(msg);
	}
}
