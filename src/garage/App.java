package garage;

public class App {

	public static void main(String[] args) {

		Car myCar = new Car("Ferrari", "200Mph", 4, true);

		myCar.print();
		myCar.vroom();

		Bike myBike = new Bike();
		myBike.print();

		Plane myPlane = new Plane("Spaceball One", "Ludicrous Speed", 0, true);
		myPlane.print();
		myPlane.barrelRoll();

	}

}
