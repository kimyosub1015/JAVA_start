package jv_0910;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		//����
		list.add("ȫ�浿");
		list.add("��⵿");
		list.add("�Ѹ�");
		//��ȸ
		int count = list.size();
		for(int i = 0;i<count;i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("***************");
		System.out.println(list);
		System.out.println("***************");
		list.remove(1);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
