package garage;

public class Bike extends Vehicle {

	private boolean hasSidecar;

	public Bike(String name, String maxSpeed, int wheelNumber, boolean hasSidecar) {
		super(name, maxSpeed, wheelNumber);
		this.hasSidecar = hasSidecar;
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

	@Override
	public void print() {
		super.print();
		System.out.println("Does the bike have a sidecar? " + isHasSidecar());
	}
}
