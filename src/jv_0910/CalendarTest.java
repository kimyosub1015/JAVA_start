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
		System.out.print("100�� ��");
		caledar.add(Calendar.DATE,100);
		printDate(caledar);
		System.out.print("10�� ��");
		caledar.add(Calendar.DATE,-10);
		printDate(caledar);
		System.out.print("����");
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		System.out.println("������ ������"+calendar.get(Calendar.DAY_OF_YEAR)+"��°");
	}
/*
	private static void printDate(Calendar caledar) {
		System.out.println(caledar.get(Calendar.YEAR)+"�� "+(caledar.get(Calendar.MONTH)+1)+"�� "+caledar.get(Calendar.DATE)+"�� "+(caledar.get(Calendar.AM_PM) == 0? "���� " : "���� ")+caledar.get(Calendar.HOUR)+"�� "+caledar.get(Calendar.MINUTE)+"�� "+caledar.get(Calendar.SECOND));
		
	}
	*/

	private static void printDate(Calendar caledar) {
		
		
		System.out.println(caledar.get(Calendar.YEAR)+"�� ");
		
	}

}
