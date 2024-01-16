package garage;

public class Bike extends Vehicle {

	private boolean hasSidecar;

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	public void wheelie() {
		System.out.println("Popped a wheelie");
	}

	@Override
	public void print() {
		System.out.println("Vehicle Name: " + getName());
		System.out.println("Max Speed: " + getMaxSpeed());
		System.out.println("Number of Wheels: " + getWheelNumber());
		System.out.println("Does the bike have a sidecar? " + isHasSidecar());
	}
}
