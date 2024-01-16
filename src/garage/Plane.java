package garage;

public class Plane extends Vehicle {

	private boolean hasWings;

	public boolean isHasWings() {
		return hasWings;
	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	public void barrelRoll() {
		System.out.println("Do a barrel roll!");
	}

	@Override
	public void print() {
		System.out.println("Vehicle Name: " + getName());
		System.out.println("Max Speed: " + getMaxSpeed());
		System.out.println("Number of Wheels: " + getWheelNumber());
		System.out.println("Do the plane have wings? " + isHasWings());
	}

}
