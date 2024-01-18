package garage;

public class Bike extends Vehicle {

	private boolean hasSidecar;

	public Bike(String name, String maxSpeed, int wheelNumber, boolean hasSidecar) {
		super(name, maxSpeed, wheelNumber);
		this.hasSidecar = hasSidecar;
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

		Bike other = (Bike) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.hasSidecar != other.isHasSidecar()) {
			return false;
		}

		return true;
	}

	public Bike() {
		super();
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	public void wheelie() {
		System.out.println("Popped a wheelie");
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Does the bike have a sidecar? " + isHasSidecar());
//	}

	@Override
	public String toString() {
		return "Bike [hasSidecar=" + hasSidecar + ", getName()=" + getName() + ", getMaxSpeed()=" + getMaxSpeed()
				+ ", getWheelNumber()=" + getWheelNumber() + "]";
	}

	@Override
	public int calcBill() {

		return 5;
	}

}
