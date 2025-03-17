package programacion.ut4.ejercicios.ejercicio17;

public class Motorcycle extends Vehicle implements Maintenance {

	private int numberOfDoors;
	
	public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
		super(licensePlate, brand, year, fuelType);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String nextMaintenanceDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Motorcycle [numberOfDoors=" + numberOfDoors + "]";
	}

	@Override
	protected double calculateSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	

}
