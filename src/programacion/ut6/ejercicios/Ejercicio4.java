package programacion.ut6.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		inicializarLista(lista);
		System.out.println("Lista: " + lista);
		try {
			rellenarLista(lista, 4);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Lista: " + lista);
	}
	
	private static void inicializarLista(List<Integer> lista) {
		for (int i = 2; i <= 10; i = i + 2) {
			lista.add(i);
		}
	}
	
	private static void rellenarLista(List<Integer> lista, Integer entero) throws IllegalArgumentException {
		if (lista.contains(entero)) {
			throw new IllegalArgumentException("El número ya está en la lista");
		} else {
			lista.add(entero);
		}
	}

}
