package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>(); //스택도 리스트를 만들수 있다. 과제는 배열로 스택을 만드는
		
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		System.out.println("=====================");
		
		stack.push("Hello");
		System.out.println(stack.pop());
		//비어있는 경우, pop()을 호출하면 예외가 발생한다.
//		stack.pop();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		stack.push("또강");
		
		System.out.println(stack.pop()); // 맨 마지막거 빼짐
		System.out.println(stack.peek()); //맨위에 있는 놈을 뭐가 있나 본다.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		//array으로 스택을 한다는데 스택이 뭐지도 모르고.
		
		
		
		

	}

}
