package garage;

public class Car extends Vehicle {

	private boolean isElectric;

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public void vroom() {
		System.out.println("Vroom Vroom");
	}

	@Override
	public void print() {
		System.out.println("Vehicle Name: " + getName());
		System.out.println("Max Speed: " + getMaxSpeed());
		System.out.println("Number of Wheels: " + getWheelNumber());
		System.out.println("Is the car electric? " + isElectric());
	}
}
