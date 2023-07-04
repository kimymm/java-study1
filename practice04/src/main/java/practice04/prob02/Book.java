package practice04.prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateRent; //문제 값자기 변경..? true : 대여중, false면 재고있음..
	
	public Book(int bookNo, String title, String author) { //왜 void가 아닐까.? 생성자이때문이지요
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateRent = 1;
	}
	
	public void rent() {
		stateRent = 0;
		System.out.println(getTitle() + "이(가) 대여됐습니다.");
	}
	public void print() {
		String str;
		if(stateRent == 1) {
			str = "재고있음";
		} else {
			str = "대여중";
		}
		System.out.println(
				"책 제목:" + getTitle() + 
				", 작가:" + getAuthor() +
				", 대여 유뮤:" + str);
		
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) { //필요한가?
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {//필요한가?
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
