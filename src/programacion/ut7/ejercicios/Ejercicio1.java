package programacion.ut7.ejercicios;

import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		char c1 = (char)System.in.read();
		char c2 = (char)System.in.read();
		char c3 = (char)System.in.read();
		char c4 = (char)System.in.read();
		
		System.out.write(c1);
		// Vaciar el flujo
		// System.out.flush();
		
		// Otra forma de vaciar el flujo
		System.out.write('\n');
		
		System.out.print("print -> ");
        System.out.print(c2);
        System.out.print('\n');

        System.out.print("println -> ");
        System.out.println(c3);

        System.out.printf("printf -> %c%n", c4);

	}

}
