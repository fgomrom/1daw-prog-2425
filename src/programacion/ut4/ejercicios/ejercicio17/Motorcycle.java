package programacion.ut4.ejercicios.ejercicio17;

public class Motorcycle extends Vehicle implements Maintenance {

	private boolean hasSidecar;

	public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, boolean hasSidecar) {
		super(licensePlate, brand, year, fuelType);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public String nextMaintenanceDate() {
		return String.valueOf(super.getYear() + 5);
	}

	@Override
	public String toString() {
		return "Motorcycle [hasSidecar=" + hasSidecar + "]";
	}

	@Override
	protected double calculateSpeed() {
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass()) // Otra comprobación extra para descartar que no son iguales si son de clases
											// diferentes, así no tiene que seguir comparando.
			return false;
		Motorcycle other = (Motorcycle) obj;
		return hasSidecar == other.hasSidecar;
	}

}
