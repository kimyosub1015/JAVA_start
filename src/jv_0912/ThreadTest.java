package jv_0912;

public class ThreadTest {

	public static void main(String[] args) {
			Counter counter = new Counter();
			Thread threadA = new CounterThread(counter,"A");
			Thread threadB = new CounterThread(counter,"B");
			//threadA�� Counter counter�� �����Ѵ�.(�ּҰ����� �����ؼ� ������)
			
			threadA.start();
			threadB.start();
			
			System.out.println(((CounterThread)threadA).counter.count);
			System.out.println(((CounterThread)threadB).counter.count);
	}

}

