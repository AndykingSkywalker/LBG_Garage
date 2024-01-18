package garage;

public class Plane extends Vehicle {

	private boolean hasWings;

	public Plane(String name, String maxSpeed, int wheelNumber, boolean hasWings) {
		super(name, maxSpeed, wheelNumber);
		this.hasWings = hasWings;
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

		Plane other = (Plane) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.hasWings != other.isHasWings()) {
			return false;
		}

		return true;
	}

	public Plane() {
		super();
	}

	public boolean isHasWings() {
		return hasWings;
	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	public void barrelRoll() {
		System.out.println("Do a barrel roll!");
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Do the plane have wings? " + isHasWings());
//	}

	@Override
	public String toString() {
		return "Plane [hasWings=" + hasWings + ", getName()=" + getName() + ", getMaxSpeed()=" + getMaxSpeed()
				+ ", getWheelNumber()=" + getWheelNumber() + "]";
	}

	@Override
	public int calcBill() {
		// TODO Auto-generated method stub
		return 100;
	}

}
