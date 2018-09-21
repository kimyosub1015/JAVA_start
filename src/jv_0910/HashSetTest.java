package jv_0910;

import java.awt.Point;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Car");hs.add("Bus");hs.add("Truck");
		hs.add("Man");hs.add("Woman");hs.add("Child");
		
		System.out.println("size : " +hs.size());
		System.out.println(hs);
		if(hs.contains("Man")) {
			hs.remove("Man");
		}
		//인자 제거
		if(hs.contains("Car")) {
			hs.add("Car2");
		}
		//인자 추가
		System.out.println(hs);
		
		Point point1 = new Point(2,3);
		hs.add(point1);
		System.out.println("size : " + hs.size());
		
		System.out.println(hs);

		Point point2 = new Point(2,3);
		hs.add(point2);
		System.out.println("size : " + hs.size());
		
		System.out.println(hs);
		
	}

}