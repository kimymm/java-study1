package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>(); //<>가 인터페이스요?
		
		String s1 = new String("둘리"); //자료구조는 내용기반이라 객체를 따지지않는다
		String s2=  new String("둘리");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s2);
		
		System.out.println(s.size());
		System.out.println(s.contains("둘리")); // 도우너 넣으면 false인데 다른객체인데 없는거아냐? : 내용기반
											//constant pull 로 인해 리터럴 보다 둘리를 가진 String으로는
		//삭제
		s.remove("마이콜");
		//순회
		for(String str : s) {
			System.out.println(str);
		}
	}

}
