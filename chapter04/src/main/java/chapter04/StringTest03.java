package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String s1 = "aBcABCabcAbc";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 7));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5)); // 주의 5 -1 
		//훨씬 더 많지만
		
		String s2 = "	ab		cd	";
		String s3 = "efg,hij,klm,nop,qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("----" + s2.trim() + "-------");// ------xxxxaboooooodxxxxx------ 공백만trim
															//글 자동완성기능?? "1234   " 이면 1234으로 db에 들어가게끔
															//이것좀 잘라내서 만들어내지 ----> 개발자의 잘못
															//이쯤되면 대충 뭐할 수 있는지 알겠지요?
		System.out.println("--------" + s2.replaceAll(" ", "") + "------------");
		
		//정규표현식 은 나중에
		
		String[] tokens = s3.split(",");
		for(String s : tokens) {//foreach
			System.out.println(s);
		}
		
		String[] tokens2 = s3.split(" ");
		for(String s : tokens2) {
			System.out.println("s3.split(): " +  s);
		}
		System.out.println();
		//연산자 오버로드 C++에서 객체를 더할수는 있지요

	}

}
