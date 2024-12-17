package programacion.ut3.examen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una frase
        System.out.print("Introduce una frase con varias palabras: ");
        String frase = scanner.nextLine();

        // Dividir la frase en palabras usando el espacio como separador
        String[] palabras = frase.split(" ");

        // Ordenar las palabras en orden ascendente (A-Z)
        Arrays.sort(palabras);

        // Mostrar las palabras ordenadas recorriendo el array en orden inverso
        for (int i = palabras.length - 1; i >= 0; i--) {
        	System.out.println(palabras[i]);
		}
        
    }
}
