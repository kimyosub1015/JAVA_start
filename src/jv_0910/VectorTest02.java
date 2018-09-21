package jv_0910;

import java.util.Iterator;
import java.util.Enumeration;
import java.util.Vector;


public class VectorTest02 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");
		
		int count = v.size();
		
		for(int i = 0;i<count;i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		System.out.println("********************");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		System.out.println("********************");
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
