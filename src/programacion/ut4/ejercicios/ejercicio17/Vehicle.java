package programacion.ut4.ejercicios.ejercicio17;

public abstract class Vehicle {
	
	private String licensePlate;
	private String brand;
	private int year;
	private FuelType fuelType;
	private static int vehicleCount;
	
	protected abstract double calculateSpeed();
	/**
	 * @return the licensePlate
	 */
	protected String getLicensePlate() {
		return licensePlate;
	}
	/**
	 * @param licensePlate the licensePlate to set
	 */
	protected void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	/**
	 * @return the brand
	 */
	protected String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	protected void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the year
	 */
	protected int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	protected void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the fuelType
	 */
	protected FuelType getFuelType() {
		return fuelType;
	}
	/**
	 * @param fuelType the fuelType to set
	 */
	protected void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	/**
	 * @return the vehicleCount
	 */
	protected static int getVehicleCount() {
		return vehicleCount;
	}
	/**
	 * @param vehicleCount the vehicleCount to set
	 */
	protected static void setVehicleCount(int vehicleCount) {
		Vehicle.vehicleCount = vehicleCount;
	}
	
	public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
		super();
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.year = year;
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Vehicle [licensePlate=" + licensePlate + ", brand=" + brand + ", year=" + year + ", fuelType="
				+ fuelType + "]";
	}
	
}
