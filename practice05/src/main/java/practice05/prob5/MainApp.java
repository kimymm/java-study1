package practice05.prob5;

public class MainApp {

	public static void main(String[] args) {
		try {
			MyStack stack = new MyStack(3); // 초기 크기를 말함
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				String s = stack.pop();
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop()); //여기서 오류! 왜냐 배열 초기화하고 하나밖에 없잖아.
			
		} catch (MyStackException ex) {
			System.out.println( ex );
		}

	}

}
