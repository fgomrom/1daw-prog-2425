package programacion.ut5.ejercicios.ejercicio6;

import java.util.SortedSet;
import java.util.TreeSet;

import programacion.ut4.ejercicios.Persona;

public class Ejercicio6 {

	public static void main(String[] args) {
		Persona fran = new Persona("Fran", 20);
		Persona pepe = new Persona("Pepe", 21);
		Persona juan = new Persona("Juan", 22);
		Persona juan20 = new Persona("Juan", 20);
		SortedSet<Persona> s = new TreeSet<>();
		s.add(fran);
		s.add(pepe);
		s.add(juan);
		s.add(juan20);
		for(Persona p: s) {
			System.out.println(p);
		}
		
		// Ejercicio 7
		System.out.println("Primero:" + s.first());
	}

}
