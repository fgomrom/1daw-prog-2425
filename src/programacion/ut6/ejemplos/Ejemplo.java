package programacion.ut6.ejemplos;

public class Ejemplo {

	public static void main(String[] args) {
		System.out.println("Comienza programa división");
		try {
			int dividendo = 5;
			int divisor = 0;
			System.out.println("Resultado: " + dividendo / divisor);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		} finally {
			System.out.println("Fin del programa");
		}
		System.out.println("¿Se ejecuta?");
	}

}
