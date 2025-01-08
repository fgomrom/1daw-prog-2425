package programacion.ut3.examen;

/**
 * Para crear el array inicial en una línea utilizo la síntaxis de poner los
 * números separados por comas y entre llaves
 * 
 * Para imprmir la referencia basta con imprimir el valor de la variable del
 * array
 * 
 * En el caso de imprimir el contenido uso el método de la clase Arrays que
 * obtiene un String con el contenido
 * 
 * Para la suma de los elementos tengo que recorrer cada posición del array e ir
 * sumando en una variable cada uno de ellos
 * 
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		// Crear un array de números enteros en una sola línea
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// Imprimir la referencia y el contenido del array sin recorrerlo
		System.out.println("Referencia del array: " + numeros);
		System.out.println("Contenido del array: " + java.util.Arrays.toString(numeros));

		// Sumar los elementos que están en posiciones impares
		int suma = 0;
		for (int i = 1; i < numeros.length; i += 2) { // Empieza en la posición 1 (impar)
			suma += numeros[i];
		}

		// Mostrar el resultado
		System.out.println("Suma de elementos en posiciones impares: " + suma);
	}
}
