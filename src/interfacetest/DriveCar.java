package interfacetest;

public class DriveCar {
	// ������ �����̰� �ϴ� �Լ�
	public void doDriveCarBus(Bus bus) {
		bus.doHandling();
		bus.userAccel();
		bus.userBreak();
	}

	// Ʈ���� �����̰� �ϴ� �Լ�
	public void doDriveCarTruck(Truck truck) {
		truck.doHandling();
		truck.userAccel();
		truck.userBreak();
	}

	// ������ī�� �����̰� �ϴ� �Լ�
	public void doDriveCarSportsCar(SportsCar sc) {
		sc.doHandling();
		sc.userAccel();
		sc.userBreak();	
	}
	// ������ �� ���� �� �ִ� �Լ� -> �������̽��� ������� �ȴ�.
	// �׷��� ������ ���� ���� ������ ���ٽ� ������ �� �� �ִ�.
	public void doDriveCar(ICarUsable ic) {
		ic.doHandling();
		ic.userAccel();
		ic.userBreak();	
	}
}
