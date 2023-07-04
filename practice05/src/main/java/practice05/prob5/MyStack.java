package practice05.prob5;

public class MyStack {
	String[] buffer = null;
	
	public MyStack(int size) { //3
		buffer = new String[size];
	}
	
	public void push(String string) {
		for(int i = 0; i < buffer.length; i++) {
			if(buffer[i] != null) {
				continue;
			} else {
				buffer[i] = string;
				break;
			}
		}
	}
	public String pop() {
		String pop = null;
		for(int i = buffer.length-1; i >= 0; i--) {
			if(buffer[i] == null) {
				continue;
			} else {
				pop = buffer[i];
				buffer[i] = null;
				break;
			}
		}
		return pop;
	}

	public boolean isEmpty() {
		
		return false;
	}	


}