package programacion.ut5.ejercicios;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

import programacion.ut4.ejercicios.Persona;

public class Ejercicio3 {

	public static void main(String[] args) {
		SortedSet<Integer> conjunto = new TreeSet<>();
		conjunto.add(2);
		conjunto.add(4);
		conjunto.add(1);
		System.out.println(conjunto);
		for(Integer numero: conjunto) {
			System.out.println(numero);
		}
		// Si quisieramos recorrer en orden inverso
//		Iterator it = conjunto.descendingIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		// Igual pero con nombres
		SortedSet<String> nombres = new TreeSet<>();
		nombres.addAll(Arrays.asList("Fran", "Pepe", "Ana"));
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		// Conjunto de Personas
//		TreeSet<Persona> personas = new TreeSet<>();
//		Persona fran = new Persona("Fran", 30);
//		personas.add(fran);
//		personas.add(new Persona("Pepe", 20));
//		personas.add(new Persona("Fran", 20));
//		System.out.println(personas);
	}

}
