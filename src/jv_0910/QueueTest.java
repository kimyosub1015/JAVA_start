package jv_0910;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		q.add("D");
		System.out.println(q.poll());
		System.out.println(q);
	}

}
