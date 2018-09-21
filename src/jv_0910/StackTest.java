package jv_0910;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s);
		
		System.out.println(s.empty());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
	}

}
