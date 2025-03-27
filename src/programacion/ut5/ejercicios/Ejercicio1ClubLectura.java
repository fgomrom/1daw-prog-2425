package programacion.ut5.ejercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1ClubLectura {
    public static void main(String[] args) {
        Set<String> libros = new HashSet<>();
        String libroABorrar;
        Scanner scanner = new Scanner(System.in);
        
        // Agregar libros
        System.out.println("Introduce títulos de libros (escribe 'fin' para terminar):");
        while (true) {
            String libro = scanner.nextLine();
            if (libro.equalsIgnoreCase("fin")) {
                break;
            }
            if (libros.add(libro)) {
                System.out.println("Libro agregado.");
            } else {
                System.out.println("Este libro ya está en la lista.");
            }
        }
        
        // Mostrar libros con for-each
        System.out.println("\n Lista de libros (for-each):");
        for (String libro : libros) {
            System.out.println(libro);
        }

        // Mostrar libros con Iterator      
        Iterator<String> it1 = libros.iterator();
        while (it1.hasNext()) {
        	System.out.println(it1.next());
        }
        
        // Borrar libros con for-each
//        System.out.println("\n Introduzca libro a borrar (for-each):");
//        String libroABorrar = scanner.nextLine();
//        for (String libro : libros) {
//            System.out.println(libro);
//            if (libro.equals(libroABorrar)) {
//            	// Esto está mal, ya que borrar mientras se recorre con un for-each no es seguro
//            	libros.remove(libroABorrar);
//			}
//        }

        // Borrar libros con Iterator
        System.out.println("\n Introduzca libro a borrar (iterator):");
        libroABorrar = scanner.nextLine();
        Iterator<String> it2 = libros.iterator();
        while (it2.hasNext()) {
        	String libro = it2.next();
        	System.out.println(libro);
            if (libro.equals(libroABorrar)) {
            	it2.remove();
			}
        }
        
        System.out.println(libros);

        scanner.close();
    }
}
