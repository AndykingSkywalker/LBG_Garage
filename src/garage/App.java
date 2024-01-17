package garage;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("Ferrari", "200Mph", 4, true));
		vehicles.add(new Plane("Spaceball One", "Ludicrous Speed", 0, true));
		vehicles.add(new Bike());

//		Car myCar = new Car("Ferrari", "200Mph", 4, true);
//
//		Bike myBike = new Bike();
//
//		Plane myPlane = new Plane("Spaceball One", "Ludicrous Speed", 0, true);

//		Vehicle[] vehicles = { myCar, myBike, myPlane };

//		System.out.println(vehicles);

		Garage myGarage = new Garage();

		myGarage.addToGarage(new Car("Ferrari", "200Mph", 4, true));
		myGarage.addToGarage(new Plane("Spaceball One", "Ludicrous Speed", 0, true));
		myGarage.addToGarage(new Bike());

		myGarage.print();

//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}
	}

}
