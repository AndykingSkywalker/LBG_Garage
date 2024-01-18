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

	public void fix() {
		int totalBill = 0;
		for (Vehicle vehicle : vehicles) {
			int bill = vehicle.calcBill();
			System.out.println(vehicle.getName() + ": " + bill);
			totalBill += bill;
		}
		System.out.println("Total Bill: " + totalBill);
	}

}
