package garage;

public class App {

	public static void main(String[] args) {

		Car myCar = new Car("Ferrari", "200Mph", 4, true);

		Bike myBike = new Bike();

		Plane myPlane = new Plane("Spaceball One", "Ludicrous Speed", 0, true);

		Vehicle[] vehicles = { myCar, myBike, myPlane };

		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}

}
