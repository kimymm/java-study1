package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) { //아주 옛날방식
		Vector<String> v =  new Vector<>(); //제너릭
		
		v.addElement("둘리"); //이 계열로 쓰던지.. 그랬어야지  List i = new Vector<>();
		v.addElement("마이콜");
		v.addElement("도우너");
		
		//순회1
		for(int i = 0; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		//순회2
		//삭제
		v.removeElementAt(2);
		System.out.println("======================");
		
		//순회2
		//enum이 옛날거요? 졸라 이상한게 이
		Enumeration<String> e = v.elements(); //일관성없어보임
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		//이게 java1.2 벡터가 나왔을때 
	
	}

}
