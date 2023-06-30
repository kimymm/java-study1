package chapter04;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		//calender을 쓰
		Calendar cal = Calendar.getInstance(); //100일 계산해주는 예제 : new 안쓰는 팩토리 메소드이다
												//진짜 달력이야
		printDate(cal);
		
		//날 지정
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 11); //MONTH-1
		cal.set(Calendar.DATE, 25);
		printDate(cal); //2023년 11월 25일은 무슨 요일일까?
		
		cal.set(2022, 2, 29);
		printDate(cal);
		
		cal.set(2023, 02, 29);
		cal.add(Calendar.DATE,100); // 전의 날짜 100일을 더한것. 데이트앱으로 바뀌어버렸네
		printDate(cal);
		

	}

	private static void printDate(Calendar cal) {
		// TODO Auto-generated method stub
		final String[] DAYS = {"일", "월", "화", "수", "목", "금", "토"}; // DAYOFWEEK가 0이 안나온다고 인덱스 0에 널은 또 멍청한코드야
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);	//0~11, +1
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); //1~7까지 나오고 0이 나오지 않는다., 1은 일요일이다, 7은 토요일
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year + "-" +
				(month+1) + "-" +
				date + " " +
				DAYS[day-1] + "요일" + //6요일을 누가 알아? 개발자만 알지
				hour + ":" +
				minute + ":" +
				second
				);
		
	}	

}
