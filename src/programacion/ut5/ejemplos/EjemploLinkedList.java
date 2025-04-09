package programacion.ut5.ejemplos;

import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {

	public static void main(String[] args) {
		// Crear una LinkedList de Strings
        List<String> lista = new LinkedList<>();

        // INSERTAR elementos
        lista.add("Manzana");               // Añadir al final
        lista.addFirst("Banana");           // Añadir al principio
        lista.addLast("Cereza");            // Añadir al final
        lista.add(1, "Naranja");            // Insertar en posición específica

        System.out.println("Lista después de insertar elementos:");
        System.out.println(lista);

        // ELIMINAR elementos
        lista.remove("Naranja");            // Eliminar por valor
        lista.remove(0);                    // Eliminar por índice
        lista.removeFirst();                // Eliminar el primero
        lista.removeLast();                 // Eliminar el último

        System.out.println("\nLista después de eliminar elementos:");
        System.out.println(lista);

        // Volver a añadir elementos para probar edición y búsqueda
        lista.add("Fresa");
        lista.add("Melón");
        lista.add("Sandía");

        // EDITAR un elemento (sustituir)
        lista.set(1, "Kiwi");               // Cambia el segundo elemento

        System.out.println("\nLista después de editar:");
        System.out.println(lista);

        // BÚSQUEDA de elementos
        boolean contiene = lista.contains("Kiwi");  // Buscar si existe un elemento
        int posicion = lista.indexOf("Melón");      // Obtener la posición de un elemento

        System.out.println("\n¿La lista contiene 'Kiwi'? " + contiene);
        System.out.println("La posición de 'Melón' es: " + posicion);

        // Mostrar los elementos uno por uno
        System.out.println("\nElementos en la lista:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }
	}

}
