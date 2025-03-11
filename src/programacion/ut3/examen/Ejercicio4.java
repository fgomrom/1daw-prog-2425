package programacion.ut3.examen;

import java.util.Scanner;

/**
 * Creo una tabla de ejemplo para probar los diferentes métodos que realizan los
 * 4 puntos que pide el ejercicio.
 * 
 * Para seleccionar cada método creo un menú que se ejecuta mientras el usuario
 * no seleccione la opción de salir.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// 1. Cargar la tabla de datos
		String[][] listaRegalos = { { "Ana", "Bicicleta", "Ubrique" }, { "Luis", "Lego", "El Bosque" },
				{ "Carla", "Videojuego", "Puerto Serrano" }, { "Miguel", "Pelota", "Ubrique" },
				{ "ara", "Coche teledirigido", "Ubrique" } };

		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			// Menú de opciones
			System.out.println("\n--- Gestión de Regalos de Navidad ---");
			System.out.println("1. Listar todos los niños y regalos");
			System.out.println("2. Buscar regalos por ciudad");
			System.out.println("3. Buscar niño por nombre");
			System.out.println("4. Ordenar niños alfabéticamente");
			System.out.println("0. Salir");
			System.out.print("Selecciona una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea

			switch (opcion) {
			case 1:
				listarRegalos(listaRegalos);
				break;
			case 2:
				buscarPorCiudad(listaRegalos, scanner);
				break;
			case 3:
				buscarPorNombre(listaRegalos, scanner);
				break;
			case 4:
				ordenarPorNombreManual(listaRegalos);
				break;
			case 0:
				System.out.println("¡Feliz Navidad! Saliendo...");
				break;
			default:
				System.out.println("Opción no válida, intenta de nuevo.");
			}
		} while (opcion != 0);

		scanner.close();

	}

	/**
	 * Método para listar todos los niños y regalos.
	 * 
	 * Imprimo, para cada fila, el nombre, la ciudad y el regalo, siguiendo el
	 * formato del ejemplo.
	 * 
	 * @param listaRegalos
	 */
	private static void listarRegalos(String[][] listaRegalos) {
		System.out.println("\nLista de regalos:");
		for (String[] regalo : listaRegalos) {
			System.out.println("- " + regalo[0] + " (" + regalo[2] + "): " + regalo[1]);
		}
	}

	/**
	 * Recorro el array principal (las filas) y luego pregunto en el array interior
	 * (las columnas) si el valor de la columna que contiene la ciudad se
	 * corresponde con la ciudad introducida por el usuario.
	 * 
	 * @param listaRegalos
	 * @param scanner      paso el scanner en lugar de crear otro
	 */
	private static void buscarPorCiudad(String[][] listaRegalos, Scanner scanner) {
		System.out.print("\nIntroduce una ciudad: ");
		String ciudad = scanner.nextLine();
		boolean encontrado = false;

		System.out.println("Regalos que se entregarán en " + ciudad + ":");
		for (String[] regalo : listaRegalos) {
			if (regalo[2].equalsIgnoreCase(ciudad)) {
				System.out.println("- " + regalo[0] + ": " + regalo[1]);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No hay regalos asignados para la ciudad " + ciudad + ".");
		}
	}

	/**
	 * Método para buscar un niño por nombre
	 * 
	 * @param listaRegalos
	 * @param scanner
	 */
	private static void buscarPorNombre(String[][] listaRegalos, Scanner scanner) {
		System.out.print("\nIntroduce el nombre del niño: ");
		String nombre = scanner.nextLine();
		boolean encontrado = false;

		for (String[] regalo : listaRegalos) {
			if (regalo[0].equalsIgnoreCase(nombre)) {
				System.out.println(nombre + " está en " + regalo[2] + " y recibirá un " + regalo[1] + ".");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontró ningún niño con el nombre " + nombre + ".");
		}
	}

	/**
	 * Método para ordenar manualmente la tabla alfabéticamente por el nombre del
	 * niño.
	 * 
	 * Aunque hay varios métodos de ordenación, he implementado el de la burbuja.
	 * Este consiste en ir desplazando aquellos elementos a su posición comparando
	 * cada elemento con el siguiente. En este caso, como los elementos del array
	 * son otro array, y dentro de este array interior lo que me importa es el
	 * nombre del niño, entonces comparo, para cada elemento del array principal
	 * aquel que contiene el nombre (la posición 0).
	 * 
	 * @param listaRegalos
	 */
	private static void ordenarPorNombreManual(String[][] listaRegalos) {
		int n = listaRegalos.length;

		// Algoritmo Bubble Sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (listaRegalos[j][0].compareToIgnoreCase(listaRegalos[j + 1][0]) > 0) {
					// Intercambiar filas completas
					String[] temp = listaRegalos[j];
					listaRegalos[j] = listaRegalos[j + 1];
					listaRegalos[j + 1] = temp;
				}
			}
		}

		System.out.println("\nLista ordenada alfabéticamente por nombre:");
		listarRegalos(listaRegalos);
	}

}
