package practice04.prob01;

public class Printer {
//	private String bookName;
//	private String author;
//	private boolean lease;
	
	public void println(String name, boolean lease, String author) {
		System.out.println(name);
		System.out.println(lease);
		System.out.println(author);
	}

	public void println(int i) {
		System.out.println(i);
	}

	public void println(boolean b) {
		System.out.println(b);
	}

	public void println(String string) {
		System.out.println(string);
	}

	public void println(double d) {
		System.out.println(d);
	}

}
