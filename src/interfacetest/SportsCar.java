package interfacetest;

public class SportsCar extends Car implements ICarUsable {

	@Override
	public void userAccel() {
		System.out.println("Truck useAccel");

	}

	@Override
	public void userBreak() {
		System.out.println("SportsCar userBreak");
		
	}

	@Override
	public void doHandling() {
		System.out.println("SportsCar doHandling");

	}

}
