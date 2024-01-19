package garage;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

	private String name;

	private String maxSpeed;

	private int wheelNumber;

	private int id;

	private static int count = 1;

	public Vehicle() {
		super();
		this.id = count++;

	}

	public abstract int calcBill();

	public Vehicle(String name, String maxSpeed, int wheelNumber) {
		super();
		this.id = count++;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.wheelNumber = wheelNumber;
	}

//	public void print() {
//		System.out.println("Vehicle Name: " + this.name);
//		System.out.println("Max Speed: " + this.maxSpeed);
//		System.out.println("Number of Wheels: " + this.wheelNumber);
//	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Vehicle o) {
		// order by ASC
		if (id < o.getId()) {
			return +1;
		} else if (id > o.getId()) {
			return -1;
		} else {
			return 0;
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
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
		Vehicle other = (Vehicle) obj;
		return name == other.name && Objects.equals(maxSpeed, other.maxSpeed)
				&& Objects.equals(wheelNumber, other.wheelNumber);
	}

	@Override
	public String toString() {
		return "ID :" + getId() + "Vehicle [name=" + name + ", maxSpeed=" + maxSpeed + ", wheelNumber=" + wheelNumber
				+ "]";
	}

}
