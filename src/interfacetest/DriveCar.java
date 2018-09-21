package interfacetest;

public class DriveCar {
	// 버스를 움직이게 하는 함수
	public void doDriveCarBus(Bus bus) {
		bus.doHandling();
		bus.userAccel();
		bus.userBreak();
	}

	// 트럭을 움직이게 하는 함수
	public void doDriveCarTruck(Truck truck) {
		truck.doHandling();
		truck.userAccel();
		truck.userBreak();
	}

	// 스포츠카를 움직이게 하는 함수
	public void doDriveCarSportsCar(SportsCar sc) {
		sc.doHandling();
		sc.userAccel();
		sc.userBreak();	
	}
	// 세가지 다 받을 수 있는 함수 -> 인터페이스를 끌어오면 된다.
	// 그러나 가지고 있지 않은 것으로 접근시 오류를 낼 수 있다.
	public void doDriveCar(ICarUsable ic) {
		ic.doHandling();
		ic.userAccel();
		ic.userBreak();	
	}
}
