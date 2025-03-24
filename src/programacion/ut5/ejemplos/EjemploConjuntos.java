package programacion.ut5.ejemplos;

import java.util.HashSet;
import java.util.Set;

public class EjemploConjuntos {

	public static void main(String[] args) {
		Set<Integer> naturales = new HashSet<>();
		naturales.add(1);
		naturales.add(2);
		naturales.add(3);
		naturales.add(4);
		System.out.println("Naturales: " + naturales);
		System.out.println("Naturales referencia: " + naturales.hashCode());
		
		Set<Integer> naturales2 = new HashSet<>();
		naturales2.add(1);
		naturales2.add(2);
		naturales2.add(3);
		naturales2.add(4);
		System.out.println("Naturales: " + naturales2);
		System.out.println("Naturales referencia: " + naturales2.hashCode());
		
		System.out.println(naturales == naturales2);
		System.out.println(naturales.equals(naturales2));
		
	}

}
