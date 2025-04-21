package programacion.ut5.ejemplos;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {

	 public static void main(String[] args) {
	        // Crear un HashMap
	        Map<String, String> m = new HashMap<>();

	        // Insertar pares clave-valor
	        m.put("123", "Juan Pérez");
	        m.put("456", "Ana Gómez");
	        m.put("789", "Luis Rodríguez");

	        // Acceder a un valor por su clave
	        System.out.println("Valor asociado a la clave '123': " + m.get("123"));

	        // Recorrer el mapa con for-each
	        for (String clave : m.keySet()) {
	            System.out.println("Clave: " + clave + ", Valor: " + m.get(clave));
	        }
	        
	        for (Map.Entry<String, String> entrada : m.entrySet()) {
	            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
	        }
	    }

}
