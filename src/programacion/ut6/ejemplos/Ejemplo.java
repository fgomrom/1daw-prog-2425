package programacion.ut6.ejemplos;

import java.util.Scanner;

public class Ejemplo {
	public static void main(String[] args) {
		System.out.println("Comienza programa división");
		Scanner sc = new Scanner(System.in);
		try {
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println("Resultado: " + dividendo / divisor);
		} catch (Throwable e) {
			System.out.println("No se puede dividir por 0");
		} finally {
			sc.close();
			System.out.println("Fin del programa");
		}
		System.out.println("Todo OK");
	}
}
