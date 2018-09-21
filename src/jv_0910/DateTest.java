package jv_0910;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());
		
		DateFormat dateFoprmat1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL : "+dateFoprmat1.format(now));
		
		DateFormat dateFoprmat2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG : "+dateFoprmat2.format(now));

		DateFormat dateFoprmat3= DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM : "+dateFoprmat3.format(now));
		
		DateFormat dateFoprmat4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT : " + dateFoprmat4.format(now));
		
		printDate(now);
		printDate2(now);
		

	}
	public static void printDate(Date date) {
		String pattern  = "yyyy년 MM월 dd일 E요일 HH:MM:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("sdf : "+sdf.format(date));
	}
	
	public static void printDate2(Date d) {
		int year = d.getYear();
		int month = d.getMonth();
		int date = d.getDate();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();
	}

}

