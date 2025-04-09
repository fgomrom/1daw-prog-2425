package programacion.ut5.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Crear lista de 10 números enteros
		List<Integer> lista = new ArrayList<>();
		//TODO: Inicializar en una sola línea usando el constructor con parámetros
		int n = 0;
		for (int i = 0; i != 10; i++) {
			lista.add(n = n + 10);
		}
		System.out.println("Lista original: " + lista);
		
		// Recorrer la lista con un ListIterator
		ListIterator<Integer> lt = lista.listIterator();
		// Recorrido hacia delante
		while(lt.hasNext()) {
			Integer numero = lt.next();
			if (numero > 50) {
				lt.set(numero*2);
			}
			System.out.println(numero);
		}
		System.out.println("Lista modificada: " + lista);
		// Recorrido hacia detrás
		/*while(lt.hasPrevious()) {
			System.out.println(lt.nextIndex());
			System.out.println(lt.previous());
		}*/
		
		// Por cada número menor que 30 se añade el número 25 justo después
		/*while(lt.hasNext()) {
			Integer numero = lt.next();
			if (numero < 30) {
				lt.add(25);
				System.out.println("Elemento introducido en el índice: " + lt.previousIndex());
			}
		}
		System.out.println("Lista modificada: " + lista);*/
		
		// Por cada número menor que 30 se añade el número 25 justo después
		// Pero recorriéndolo haca atrás
		while(lt.hasPrevious()) {
			Integer numero = lt.previous();
			if (numero < 30) {
				lt.add(25);
				System.out.println("Elemento introducido en el índice: " + lt.previousIndex());
				if (lt.hasPrevious()) {
					lt.previous();
				}
			}
		}
		System.out.println("Lista modificada: " + lista);
	}

}
