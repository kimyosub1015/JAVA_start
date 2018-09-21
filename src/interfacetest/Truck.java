package interfacetest;

public class Truck extends Car implements ICarUsable {

	@Override
	public void userAccel() {
		System.out.println("Truck useAccel");

	}

	@Override
	public void userBreak() {
		System.out.println("Truck userBreak");

	}

	@Override
	public void doHandling() {
		System.out.println("Truck doHandling");

	}

}
