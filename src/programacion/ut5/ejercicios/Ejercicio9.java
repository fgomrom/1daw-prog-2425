package programacion.ut5.ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Fran");
		lista.add("Ana");
		lista.add("Pepe");
		lista.add("Juan");
		lista.add("Ramón");
		
		muestraNombres(lista);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un nombre:");
		String nombre = sc.nextLine();
		lista.add(nombre);
		
		System.out.println("Introduzca un nombre:");
		nombre = sc.nextLine();
		
		// Eliminar usando los métodos de List
		lista.remove(nombre);
		
		// Eliminar usando un Iterador
		//eliminarNombre(lista, nombre);
		
		// Mostrar tamaño de la lista
		System.out.println("Tamaño de la lista:" + lista.size());
		
		sc.close();
	}

	/**
	 * @param lista
	 * @param nombre
	 */
	private static void eliminarNombre(List<String> lista, String nombre) {
		Iterator<String> it = lista.iterator();
		boolean encontrado = false;
		while(!encontrado && it.hasNext()) {
			if (it.next().equals(nombre)) {
				it.remove();
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No encontrado");			
		} else {
			System.out.println("Encontrado y eliminado!");
		}
	}
	
	private static void muestraNombres(List<String> lista) {
		System.out.println("Lista de nombres:");
		for(String nombre: lista) {
			System.out.println(nombre);
		}
	}

}
