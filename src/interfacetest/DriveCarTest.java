package interfacetest;

public class DriveCarTest {

	public static void main(String[] args) {
		
		DriveCar dc = new DriveCar();
		Truck truck = new Truck();
		Bus bus = new Bus();
		SportsCar sc = new SportsCar();
		
		ICarUsable itruck = (ICarUsable)truck;
		//����� ����ȯ�� �Ѵ�.
		
		dc.doDriveCarTruck(truck);
		dc.doDriveCarBus(bus);
		dc.doDriveCarSportsCar(sc);
		
		dc.doDriveCar((ICarUsable)truck);
		dc.doDriveCar(bus);
		dc.doDriveCar(sc);
		dc.doDriveCar(itruck);
		
		//�������̽��� ����ܰ迡�� �����ؼ� ���� �ڵ��� ������ �Ѵ�.
	}

}
