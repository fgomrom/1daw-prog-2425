package programacion.ut3.ejercicios;

import java.util.Scanner;

public class EjemploRecorrer {

	public static void main(String[] args) {
		// Crear array de 5 posiciones tipo caracter
		char[] letras = new char[6];
		// Recorrer el array para inicializar
		// cada posición con la letra 'a'
		for (int i = 0; i <= letras.length; i++) {
			letras[i] = 'a';
		}

		// Crear un array que almacene los n primeros números naturales donde n es un
		// valor dado por el usuario.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	}

}
