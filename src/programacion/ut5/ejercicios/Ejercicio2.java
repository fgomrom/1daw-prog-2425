package programacion.ut5.ejercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2 {

	public static void main(String[] args) {
		Set<String> nombresLinkedHashSet = new LinkedHashSet<>();
		Set<String> nombresHashSet = new HashSet<>();
		nombresLinkedHashSet.add("Fran");
		nombresLinkedHashSet.add("Sonia");
		nombresLinkedHashSet.add("Alba");
		System.out.println(nombresLinkedHashSet);
		System.out.println("Tamaño: "+nombresLinkedHashSet.size());
		boolean agregar = nombresLinkedHashSet.add("Fran");//No permite duplicados
		System.out.println(agregar);
		System.out.println(nombresLinkedHashSet);
		System.out.println("Tamaño: "+nombresLinkedHashSet.size());
		nombresLinkedHashSet.add(null);
		System.out.println(nombresLinkedHashSet);
		nombresLinkedHashSet.add(null);
		System.out.println(nombresLinkedHashSet); //Sólo permite un null
		
		imprimir(nombresLinkedHashSet);
		
		nombresHashSet.addAll(nombresLinkedHashSet);
		
		imprimir(nombresHashSet);
	}
	
	static void imprimir (Set<String> s) {
		System.out.println(s.getClass() + ":");
		for(String nombre : s) {
			System.out.println("D. " + nombre);
		}
	}

}
