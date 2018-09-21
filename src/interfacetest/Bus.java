package interfacetest;

public class Bus extends Car implements ICarUsable {

	@Override
	public void userAccel() {
		System.out.println("bus useAccel");

	}

	@Override
	public void userBreak() {
		System.out.println("bus userBreak");

	}

	@Override
	public void doHandling() {
		System.out.println("bus doHandling");

	}

}
