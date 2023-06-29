package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetest {

	public static void main(String[] args) {
		Date now= new Date(); //윈도우 현재시간
		printDate01(now);
//		System.out.println(now); //toString이 Date객체에 오버라이딩이 되있겠지
		
		printDate02(now);
	}
	
	private static void printDate02(Date d) {
		//년도(+1900)
		int year = d.getYear(); //왜 또쓰지말라그래 c++자바
		System.out.println(year + 1900); //calender클래
		
		// 월(0~11) +1
		int month = d.getMonth();
		
		//일
		int date = d.getDate();
		
		//시
		int hour = d.getHours();
		
		//분
		int minute = d.getMinutes();
		
		//초
		int second = d.getSeconds();
		
		System.out.println("현재 시간: " + (year+1900) + ":" + (month > 10 ? (month+1) + ":" + date + " " +  hour + ":" + minute + ":" + second);
		
	}

	public static void printDate01(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //
		String date = sdf.format(d);
		System.out.println(d);
		System.out.println(date); //
	}

}
