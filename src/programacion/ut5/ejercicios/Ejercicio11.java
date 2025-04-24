package programacion.ut5.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * También puede hacerse usando addLast y removeFirst como dice el enunciado. 
	 * Lo importante es que el orden de entrada sea el mismo que de salida.
	 */
	public static void main(String[] args) {
		List<String> cola = new ArrayList<>();
		
		// Añadimos 5 tareas a la cola
		cola.addFirst("tarea1");
		cola.addFirst("tarea2");
		cola.addFirst("tarea3");
		cola.addFirst("tarea4");
		cola.addFirst("tarea5");
		
		mostrar(cola);
		
		System.out.println("\nIntroduzca nueva tarea:\n");
		Scanner sc = new Scanner(System.in);
		String nuevaTarea = sc.nextLine();
		cola.addFirst(nuevaTarea);
		
		mostrar(cola);
		
		eliminarTarea(cola);
		
		mostrar(cola);
		
	}
	
	private static void mostrar(List<String> cola) {
		for(String s : cola) {
			System.out.println(s);
		}
	}
	
	private static void eliminarTarea(List<String> cola) {
		String eliminar = cola.removeLast();
		System.out.println("Tarea elminada: " + eliminar);
	}

}
