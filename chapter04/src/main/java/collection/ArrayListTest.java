package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
				List<String> list = new ArrayList<>(); //<String>생략가능 //컴포넌트식 개발 벡터와 똑같은 출력형식
				
				list.add("둘리");
				list.add("마이콜");
				list.add("더우너");
				
				//순회1
				for(int i =0 ; i < list.size(); i++) { //요즘은 foreach하죠
					String s = list.get(i);
					System.out.println(s);
				}
				
				// 삭제
				list.remove(2);
				
				System.out.println("===================");
				
				
				//순회2 
				Iterator<String> it = list.iterator();
				while(it.hasNext()) {
					String s = it.next();
					System.out.println(s);
				}
				
				
				//순회3 iterator가 구현되있는 collection의 iterator가
				for(String s : list) {
					System.out.println(s);
				}

	}

}
