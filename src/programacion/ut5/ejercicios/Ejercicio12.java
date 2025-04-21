package programacion.ut5.ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio12 {

	public static void main(String[] args) {
		Map<String, String> m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca opción:");
		System.out.println("1 - HashMap\r\n"
				+ "	2 - LinkedHashMap\r\n"
				+ "	3 - TreeMap\r\n"
				+ "");
		String opcion = sc.nextLine();
		switch (opcion) {
		case "1":
			m = new HashMap<>();
			break;
		case "2":
			m = new LinkedHashMap<>();
			break;
		case "3":
			m = new TreeMap<>();
			break;
		default:
			m = new HashMap<>();
		}
		
		
		m.put("ent", "Número entero");
		m.put("int", "Número entero"); // Sí admite valores repetidos
		m.put("int", "Nuevo"); // No admite claves repetidas
		
		if(m.containsKey("int")) { // Si contiene la clave, entonces la elimina
			m.remove("int"); // Elimina el elemento con clave "int"
		}
		
		System.out.println(m.get("int"));
		
		m.replace("int", "Entero");
		
		Iterator<Entry<String, String>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator<String> it2 = m.keySet().iterator();
		String s;
		while (it2.hasNext()) {
			s = m.get(it2.next());
			System.out.println(s);
			if (s.equals("Número entero") && !m.getClass().equals(TreeMap.class)) {
				m.put(null, null);
				m.put(null, null); //Sólo puedo añadir uno pq no admite duplicados
			}
		}
		System.out.println(m);
		
		
	}
	

}
