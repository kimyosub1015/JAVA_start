package interfacetest;

public class DriveCarTest {

	public static void main(String[] args) {
		
		DriveCar dc = new DriveCar();
		Truck truck = new Truck();
		Bus bus = new Bus();
		SportsCar sc = new SportsCar();
		
		ICarUsable itruck = (ICarUsable)truck;
		//명시적 형변환을 한다.
		
		dc.doDriveCarTruck(truck);
		dc.doDriveCarBus(bus);
		dc.doDriveCarSportsCar(sc);
		
		dc.doDriveCar((ICarUsable)truck);
		dc.doDriveCar(bus);
		dc.doDriveCar(sc);
		dc.doDriveCar(itruck);
		
		//인터페이스는 설계단계에서 구상해서 실제 코딩시 구현을 한다.
	}

}
