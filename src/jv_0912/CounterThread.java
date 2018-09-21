package jv_0912;


public class CounterThread extends Thread{
	public Counter counter = null;
	public String name ="";
	
	
	
	public CounterThread(Counter counter, String name) {
		super();
		this.counter = counter;
		this.name = name;
	}


	public void run() {
		synchronized (counter) {

			for(int i = 0;i<10;i++){
				counter.add(i);
				System.out.println("["+this.name+"] count : "+counter.count);
			}
			
		}
	}

}
