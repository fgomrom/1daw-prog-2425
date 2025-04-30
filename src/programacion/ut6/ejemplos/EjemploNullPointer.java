package programacion.ut6.ejemplos;

import java.io.FileNotFoundException;
import java.util.Scanner;

import programacion.ut4.ejercicios.Persona;

public class EjemploNullPointer {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Persona p = null;
		try {
//			int n = sc.nextInt();
			p.getNombre();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("La persona es nula");
			p = new Persona();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			// Siempre se ejecuta
		}
//		sc.close();
	}

}
