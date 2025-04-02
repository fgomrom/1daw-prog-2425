package programacion.ut5.ejemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEjemplo {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(Integer.valueOf(2));
		treeSet.add(Integer.valueOf(3));
		treeSet.add(Integer.valueOf(1));
		System.out.println("TreeSet ordena los elementos: " + treeSet);
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(Integer.valueOf(2));
		linkedHashSet.add(Integer.valueOf(3));
		linkedHashSet.add(Integer.valueOf(1));
		System.out.println("LinkedHashSet ordena los elementos por orden de inserción: " + linkedHashSet);
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(1);
		System.out.println("HashSet no garantiza orden de los elementos: " + hashSet);
	}

}
