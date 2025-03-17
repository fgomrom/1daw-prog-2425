package programacion.ut4.ejercicios.ejercicio17;

public class Car extends Vehicle implements Maintenance {

	private int numberOfDoors;
	
	public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
		super(licensePlate, brand, year, fuelType);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String nextMaintenanceDate() {
		return String.valueOf(super.getYear() + 5);
	}

	@Override
	protected double calculateSpeed() {
		return 50;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		//return super.toString() + " --> Car [numberOfDoors=" + numberOfDoors + "]";
		// Ejemplo de otra implementación alternativa:
		return "Tipo de vehículo: Coche con Matrícula: " + super.getLicensePlate();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // Compara referencias
			return true;
		if (!super.equals(obj)) // Compara atributos de la clase padre (delega este trabajo en la clase padre)
			return false;
		Car other = (Car) obj;
		return numberOfDoors == other.numberOfDoors;
	}
	
}
