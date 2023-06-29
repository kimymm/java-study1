package chapter01;

public class Ex17Switch {

	public static void main(String[] args) {
		char grade = ' ';
		int score = 72;
		
		switch(score / 10) {
			case 10:
			case 9: {
				grade = 'A';
				break;
			}
			case 8: {
				grade = 'B';
				break;
			}
			case 7: {
				grade = 'C';
				break;
			}
			case 6: {
				grade = 'D';
				break;
			}
			default: {
				grade = 'F';
				break;
			}
		}
		
		System.out.println("학점은 " + grade + "입니다.");
	}

}
