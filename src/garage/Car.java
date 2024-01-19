package garage;

public class Car extends Vehicle {

	private boolean isElectric;

	public Car(String name, String maxSpeed, int wheelNumber, boolean isElectric) {
		super(name, maxSpeed, wheelNumber);
		this.isElectric = isElectric;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		Car other = (Car) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.isElectric != other.isElectric()) {
			return false;
		}

		return true;
	}

	public Car() {
		super();
	}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public void vroom() {
		System.out.println("Vroom Vroom");
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Is the car electric? " + isElectric());
//	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Car [isElectric=" + isElectric + ", getName()=" + getName() + ", getMaxSpeed()="
				+ getMaxSpeed() + ", getWheelNumber()=" + getWheelNumber() + "]";
	}

	@Override
	public int calcBill() {

		return 10;
	}

}
