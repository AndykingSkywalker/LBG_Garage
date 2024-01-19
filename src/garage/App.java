package garage;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("Ferrari", "200Mph", 4, true));
		vehicles.add(new Car("Lambo", "250Mph", 4, true));
		vehicles.add(new Car("Ford", "90Mph", 4, true));

		Car myCar = new Car("Ferrari", "200Mph", 4, true);
		Car myCar2 = new Car("Ferrari", "220Mph", 4, true);
////
////		Bike myBike = new Bike();
////
//		Plane myPlane = new Plane("Spaceball One", "Ludicrous Speed", 0, true);
//		Plane myPlane2 = new Plane("Spaceball One", "Ludicrous Speed", 0, true);

//		Vehicle[] vehicles = { myCar, myBike, myPlane };

//		System.out.println(vehicles);

		Garage myGarage = new Garage();
//
//		myGarage.addToGarage(new Car("Ferrari", "100mph", 4, true));
//		myGarage.addToGarage(new Car("Lambo", "120mph", 4, true));
//		myGarage.addToGarage(new Car("Ford", "80mph", 4, true));
//
//		System.out.println(myGarage.toString());
		myGarage.addToGarage(new Car("Ferrari", "140Mph", 4, true));
		myGarage.addToGarage(new Car("Rocket Car", "200Mph", 3, false));
		myGarage.addToGarage(new Plane("Spaceball One", "Ludicrous Speed", 0, true));
		myGarage.addToGarage(new Plane("Millenium Falcon", "12 Parsecs", 0, false));
		myGarage.addToGarage(new Bike("Dirtbike", "80mph", 2, true));

//		System.out.println("myCar.equals(myCar2) " + myCar.equals(myCar2));
//		System.out.println("myCar.equals(myPlane2) " + myPlane.equals(myPlane2));
//
//		System.out.println("NEXT BATCH");
//
//		myGarage.removeFromGarage(new Car("Ferrari", "200Mph", 4, true));
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}

//		myGarage.removeById(9);

//		System.out.println(myGarage.toString());

		System.out.println("VEHICLES: " + vehicles);

		Collections.sort(vehicles);

		System.out.println("VEHICLES: " + vehicles);

//
//		

	}

}
