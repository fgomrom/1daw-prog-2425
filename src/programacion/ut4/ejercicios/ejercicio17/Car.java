package programacion.ut4.ejercicios.ejercicio17;

public class Car extends Vehicle implements Maintenance {

	private int numberOfDoors;
	
	public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
		super(licensePlate, brand, year, fuelType);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String nextMaintenanceDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
