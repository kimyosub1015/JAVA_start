package jv_0910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		{
			List<String> list = new ArrayList<String>();
			
			List<String> list2 = Collections.synchronizedList(new ArrayList<String>());

			// ����
			list.add("ȫ�浿");
			list.add("��⵿");
			list.add("�Ѹ�");

			int count = list.size();
			for (int i = 0; i < count; i++) {
				String s = list.get(i);
				System.out.println(s);
			}
			System.out.println("***************");
			list.remove("��⵿");
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				String s = it.next();
				System.out.println(s);
			}

		}
	}
}