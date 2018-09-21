package jv_0910;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar caledar = Calendar.getInstance();
		printDate(caledar);
		/*
		caledar.set(Calendar.YEAR, 2016);
		printDate(caledar);
		caledar.set(2016, 2, 12);
		printDate(caledar);
		caledar.set(2016, 2,12,13,59);
		printDate(caledar);
		caledar.set(2016, 6,12,13,59,30);
	*/	
		System.out.print("100일 후");
		caledar.add(Calendar.DATE,100);
		printDate(caledar);
		System.out.print("10일 전");
		caledar.add(Calendar.DATE,-10);
		printDate(caledar);
		System.out.print("오늘");
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		System.out.println("오늘은 올해의"+calendar.get(Calendar.DAY_OF_YEAR)+"일째");
	}
/*
	private static void printDate(Calendar caledar) {
		System.out.println(caledar.get(Calendar.YEAR)+"년 "+(caledar.get(Calendar.MONTH)+1)+"월 "+caledar.get(Calendar.DATE)+"일 "+(caledar.get(Calendar.AM_PM) == 0? "오전 " : "오후 ")+caledar.get(Calendar.HOUR)+"시 "+caledar.get(Calendar.MINUTE)+"분 "+caledar.get(Calendar.SECOND));
		
	}
	*/

	private static void printDate(Calendar caledar) {
		
		
		System.out.println(caledar.get(Calendar.YEAR)+"년 ");
		
	}

}
