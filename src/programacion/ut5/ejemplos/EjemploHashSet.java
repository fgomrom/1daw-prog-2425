package programacion.ut5.ejemplos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSet {

	public static void main(String[] args) {
		Set<String> conjuntoCadenas = new HashSet<>();
		String alumno1 = "Alumno1";
		String alumno2 = "Alumno2";
		String alumno3 = "Alumno3";
		conjuntoCadenas.add(alumno1);
		conjuntoCadenas.add(alumno2);
		conjuntoCadenas.add(alumno3);
		String[] alumnos = {alumno1, alumno2, alumno3};
		
		conjuntoCadenas.addAll(Arrays.asList(alumnos));
		
		conjuntoCadenas.add(null);
		
		System.out.println(conjuntoCadenas);
		
		for(String s: conjuntoCadenas) {
			System.out.println(s);
		}
		
		Iterator<String> it = conjuntoCadenas.iterator();
		String s;
		while (it.hasNext()) {
			s = it.next();
			System.out.println(s);
		}
		
	}

}
