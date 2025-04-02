package programacion.ut5.ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;

import programacion.ut4.ejercicios.Persona;

public class EjemploComparable {

	public static void main(String[] args) {
		SortedSet<Persona> personas = new TreeSet<>();
		Persona fran = new Persona("Fran", 20);
		Persona fran10 = new Persona("Fran", 10);
		Persona ana = new Persona("Ana", 20);
		personas.add(fran);
		personas.add(ana);
		personas.add(fran10);
		for(Persona p: personas) {
			System.out.println(p);
		}
	}

}
