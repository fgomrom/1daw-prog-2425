package programacion.ut5.ejercicios;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import programacion.ut4.ejercicios.Persona;

public class Ejercicio7 {
    public static void main(String[] args) {
    	Persona fran = new Persona("Fran", 20);
		Persona pepe = new Persona("Pepe", 21);
		Persona juan = new Persona("Juan", 22);
		Persona juan20 = new Persona("Juan", 20);
		Set<Persona> s = new TreeSet<>();
		s.add(fran);
		s.add(pepe);
		s.add(juan);
		s.add(juan20);
		
		// Primera persona del conjunto
		Iterator<Persona> it = s.iterator();
		if(it.hasNext()) {
			System.out.println("Primero en el Set:" + it.next());
		}
		
		SortedSet<Persona> ss = new TreeSet<>(s);
		// Primera persona del conjunto
		System.out.println("Primero en el SortedSet:" + ss.first());
		
		// Última persona del conjunto
		System.out.println("Último en el SortedSet:" + ss.last());
		
		// Anteriores a juan
		System.out.println("Anteriores a Juan en el SortedSet:"
		+ ss.headSet(juan));
    }

}

