package jv_0910;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class HashtableTest02 {

	public static void main(String[] args) {
		//�ؽ����̺� �����͸� �Է��� �� integer���� �̾ƿͼ� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
		
		Hashtable <String,Integer>pt = new Hashtable<String,Integer>();
		/*
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		v1.add("�Ѹ�"); v1.add("��浿"); v1.add("����"); v1.add("��ġ"); v1.add("������");
		v2.add(10); v2.add(20); v2.add(30);v2.add(40); v2.add(50);
		
		Pt.put("Name", v1);
		Pt.put("Point", v2);
		System.out.println(Pt.get("Point"));
		*/
		pt.put("�Ѹ�",10);
		pt.put("��浿",20);
		pt.put("����",30);
		pt.put("��ġ",20);
		pt.put("������",10);
		
		
		Enumeration<Integer> en = pt.elements();
		
		int sum = 0;
		int count = pt.size();
		
		while(en.hasMoreElements()) {
			int value = en.nextElement();
			System.out.println("value : " + value);
			sum += value;
		}
		System.out.println("��� : "+sum/count);
		//sum = 0;		
		
		 
	}

}
