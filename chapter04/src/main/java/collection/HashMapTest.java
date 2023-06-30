package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest { //상당히 많이 쓰는 것

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		m.put("one", 1);//autoboxing 객체인데 기본형이 온다?
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("one"); //auto unboxing 기억안나죠?
		int j = m.get("two");
		System.out.println(i + ":" + j);
		
		m.put("three",33333);
		System.out.println(m.get("three"));
		
		//1,2,3,데이터 직접적 순회는 못한다. 키로는 가능 get으로
		//순회
		Set<String> s = m.keySet();
		for(String key : s) {
			System.out.println(m.get(key));
		}
		
	}

}
