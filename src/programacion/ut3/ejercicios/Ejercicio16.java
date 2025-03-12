package programacion.ut3.ejercicios;

import java.util.Scanner;

/**
 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
 * decir, la que contiene menos caracteres.
 * 
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		// Introducir por teclado dos frases
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String f1 = sc.nextLine();
		System.out.println("Introduzca otra frase");
		String f2 = sc.nextLine();
		
		// Frase más corta
		if (f1.length() < f2.length()) {
			System.out.println("La primera es la más corta");
		} else {
			System.out.println("La segunda es la más corta");			
		}
	}

}
