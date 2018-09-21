package jv_0910;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Size : "+v.size()+" Capacity : "+v.capacity());
		
		for(int i = 0;i<10;i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("Size : "+v.size()+" Capacity : "+v.capacity());
		
		Integer i0 = (Integer)v.elementAt(0);
		System.out.println(i0);
		int i1 = ((Integer) v.elementAt(9)).intValue();
		System.out.println(i1);
		
		v.removeElement(i0);
		v.removeElement(1);
		System.out.println(v);

	}

}
