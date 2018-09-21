package jv_0910;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class HashtableTest {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		v1.add("Taxi"); v1.add("Bus"); v1.add("Truck");
		v2.add("Man"); v2.add("Woman"); v2.add("Child");
		
		ht.put("Car", v1);
		ht.put("Person", v2);
		System.out.println(ht.get("Car"));
		
		if(ht.containsKey("Person"))
				System.out.println(ht.get("Person"));
		System.out.println(ht.contains(v1));
		
		//키 값을 통한 해쉬테이블의 데이터 값 모두 가져오기
		
		Enumeration eKey = ht.keys();
		while(eKey.hasMoreElements()) {
			String key  = (String)eKey.nextElement();
			System.out.println(key + " : "+ht.get(key));
		}
	}

}
