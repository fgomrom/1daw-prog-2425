package programacion.ut6.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo {
	public static void main(String[] args) {
		System.out.println("Comienza programa división");
		Scanner sc = new Scanner(System.in);
		try {
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println("Resultado: " + dividendo / divisor);
		} catch (ArithmeticException e) {
			System.err.println("No se puede dividir por 0. Mensaje: " + e.getMessage());
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("Fin del programa");
		}
		System.out.println("Todo OK");
	}
}
