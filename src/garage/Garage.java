package garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addToGarage(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeFromGarage(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

//	public void print() {
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}
//	}

	@Override
	public String toString() {
		return "vehicles=" + vehicles + "]";
	}

}
