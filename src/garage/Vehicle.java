package garage;

public class Vehicle {

	private String name;

	private String maxSpeed;

	private int wheelNumber;

	public Vehicle() {

	}

	public Vehicle(String name, String maxSpeed, int wheelNumber) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.wheelNumber = wheelNumber;
	}

	public void print() {
		System.out.println("Vehicle Name: " + this.name);
		System.out.println("Max Speed: " + this.maxSpeed);
		System.out.println("Number of Wheels: " + this.wheelNumber);
	}

	public String getName() {
		return name;
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

}
