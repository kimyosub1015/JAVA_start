package jv_0912;

public class ThreadTest {

	public static void main(String[] args) {
			Counter counter = new Counter();
			Thread threadA = new CounterThread(counter,"A");
			Thread threadB = new CounterThread(counter,"B");
			//threadA는 Counter counter를 참조한다.(주소값으로 저장해서 참조중)
			
			threadA.start();
			threadB.start();
			
			System.out.println(((CounterThread)threadA).counter.count);
			System.out.println(((CounterThread)threadB).counter.count);
	}

}

