package programacion.ut4.ejercicios.ejercicio17;

public class Principal17 {

	public static void main(String[] args) {
		
		Vehicle coche1 = new Car("123456A", "Seat", 2020, FuelType.DIESEL, 5);
		Car coche2 = new Car("123456B", "Seat", 2020, FuelType.DIESEL, 5);
		Motorcycle moto1 = new Motorcycle("123456C", "Seat", 2020, FuelType.DIESEL, false);
		//Vehicle vehicle = new Vehicle(); //No se puede instanciar clase abstracta
		
		// Probar toString
		System.out.println("Coche1: " + coche1);
		System.out.println("Coche2: " + coche2);
		System.out.println("Moto1: " + moto1);
		
		// Probar equals
		if (coche1.equals(coche2))
			System.out.println("coche1 y coche 2 son Iguales");
		else 
			System.out.println("coche1 y coche 2 son Distintos");
	}

}
