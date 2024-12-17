package programacion.ut3.examen;

import java.util.Scanner;

/**
 * Ejecuto el scanner dos veces, una para perdir el tamaño y otra en un bucle para ir pidiendo números hasta alcanzar el tamaño.
 * 
 * Después recorro el array y voy comparando y actualizando el máximo 
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario el tamaño de la tabla
		System.out.print("Introduce el tamaño de la tabla de números naturales: ");
		int tamano = scanner.nextInt();

		// Opcional: Validar que el tamaño sea mayor a 0
		if (tamano <= 0) {
			System.out.println("El tamaño debe ser un número mayor que 0.");
			return;
		}

		// Crear el array
		int[] tabla = new int[tamano];

		// Rellenar el array con números naturales
		System.out.println("Introduce " + tamano + " números naturales (mayores a 0):");
		for (int i = 0; i < tamano; i++) {
			do {
				System.out.print("Número en posición " + i + ": ");
				tabla[i] = scanner.nextInt();
				if (tabla[i] <= 0) {
					System.out.println("Error: El número debe ser mayor que 0. Inténtalo de nuevo.");
				}
			} while (tabla[i] <= 0); // Opcional: Asegura que el número sea mayor que 0
		}

		// Buscar la posición del número más grande
		int max = tabla[0];
		int posicionMax = 0;

		for (int i = 1; i < tabla.length; i++) {
			if (tabla[i] > max) {
				max = tabla[i];
				posicionMax = i; // Guarda la posición del primer máximo
			}
		}

		// Mostrar el resultado
		System.out.println("El número más grande es " + max + " y se encuentra en la posición " + posicionMax + ".");
	}
}
