package practice05.prob2;

public class SmartPhone extends Phone {
	@Override
	public void execute( String function ) {
		if(function.equals("앱")) {
			runApp();
		} else if(function.equals("통화")) {
			super.execute(function);
		} else if(function.equals("음악")) {
			System.out.println("다운로드해서 음악재생");
		}
	}
	private void runApp() {
		System.out.println("앱실행");
	}	
}
