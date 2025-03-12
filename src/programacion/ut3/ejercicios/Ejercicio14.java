package programacion.ut3.ejercicios;

import java.util.Arrays;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO copiar el array orginal al destino
		
		// Array original
		int[] original = {18,21,19,18,20};
		// Creo array destino con el mismo tamaño que el original
		int[] destino = new int[original.length];
		
		for(int i = 0; i < original.length; i++) {
			destino[i] = original[i];
		}
		System.out.println(Arrays.toString(destino));
		
		System.out.println(Ejercicio13.compararArrays(original, destino));
		
	}

}
