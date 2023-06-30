package prob2;

public class Phone {
	public void execute( String function ) {
		call(); //excute 오버라이드하는 문제 
	}
	
	private void call(){
		System.out.println( "통화기능시작" );
	}
}
