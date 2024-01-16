package garage;

public class App {

	public static void main(String[] args) {

		Car ferrari = new Car();
		ferrari.setName("Ferrari");
		ferrari.setMaxSpeed("200Mph");
		ferrari.setWheelNumber(4);
		ferrari.setElectric(false);
		ferrari.vroom();

		Bike ducatti = new Bike();
		ducatti.setName("Ducatti");
		ducatti.setMaxSpeed("120Mph");
		ducatti.setWheelNumber(2);
		ducatti.setHasSidecar(false);
		ducatti.wheelie();

		Plane boeing = new Plane();
		boeing.setName("Boeing 747");
		boeing.setMaxSpeed("500Mph");
		boeing.setWheelNumber(6);
		boeing.setHasWings(true);
		boeing.barrelRoll();

		ferrari.print();
		ducatti.print();
		boeing.print();

	}

}
