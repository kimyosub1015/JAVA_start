package jv_0910;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class HashtableTest02 {

	public static void main(String[] args) {
		//해시테이블에 데이터를 입력한 수 integer값을 뽑아와서 평균을 구하는 프로그램을 작성하세요.
		
		Hashtable <String,Integer>pt = new Hashtable<String,Integer>();
		/*
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		v1.add("둘리"); v1.add("고길동"); v1.add("희동이"); v1.add("또치"); v1.add("마이콜");
		v2.add(10); v2.add(20); v2.add(30);v2.add(40); v2.add(50);
		
		Pt.put("Name", v1);
		Pt.put("Point", v2);
		System.out.println(Pt.get("Point"));
		*/
		pt.put("둘리",10);
		pt.put("고길동",20);
		pt.put("희동이",30);
		pt.put("또치",20);
		pt.put("마이콜",10);
		
		
		Enumeration<Integer> en = pt.elements();
		
		int sum = 0;
		int count = pt.size();
		
		while(en.hasMoreElements()) {
			int value = en.nextElement();
			System.out.println("value : " + value);
			sum += value;
		}
		System.out.println("평균 : "+sum/count);
		//sum = 0;		
		
		 
	}

}
