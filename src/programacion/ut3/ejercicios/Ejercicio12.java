package programacion.ut3.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Declaraciones
		Scanner sc = new Scanner(System.in);
		int n;
		int resultado;

		// Crear array de 5 enteros
		int[] a = new int[5];

		// Inicializar el array con número aleatorios
		// invocando al un método o directamente aquí
		inicializaArrayAleatorio(a);
		// Ordena array para que ambas búsquedas den el mismo resultado
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		// Invocar al método de búsqueda
		n = sc.nextInt();
		resultado = busquedaLineal(n, a);

		// Imprmir resultado
		imprimir(resultado);

		// Invocar búsqueda binaria de la clase java.util.Arrays
		resultado = java.util.Arrays.binarySearch(a, n);

		imprimir(resultado);

	}

	/**
	 * Imprime el resultado
	 * 
	 * @param resultado
	 */
	private static void imprimir(int resultado) {
		if (resultado == -1)
			System.out.println("No encontrado");
		else {
			System.out.println("Econtrado en posición: " + resultado);
		}
	}

	/**
	 * Recibe un número y un array y devuelva la posición donde ha encontrado el
	 * número o -1 si no ha encontrado el número
	 * 
	 * @param n el número que se desea buscar
	 * @param a el array donde se desea encontrar el número
	 * @return -1 si no lo encuentra y el índice (empezando en 0) en otro caso
	 */
	public static int busquedaLineal(int n, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n)
				return i;
		}
		return -1;
	}

	public static void inicializaArrayAleatorio(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}
	}

}
