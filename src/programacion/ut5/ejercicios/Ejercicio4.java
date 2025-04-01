package programacion.ut5.ejercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Agregar elementos a cada Set
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // Parte 5 Iteración básica
        mostrarElementosConIterador(hashSet);
        mostrarElementosConIterador(treeSet);
        mostrarElementosConIterador(linkedHashSet);
        
        SortedSet<Integer> conjuntoAleatorio = new TreeSet<>();
        conjuntoAleatorio.addAll(Arrays.asList(2,6,10,1,30,8,12));
        System.out.println(conjuntoAleatorio);
        Iterator<Integer> itRemove = conjuntoAleatorio.iterator();
        Integer e;
        while (itRemove.hasNext()) {
        	e = itRemove.next();
        	if (e%2==0) {
        		itRemove.remove();
        	}
        	conjuntoAleatorio.add(1000);
        }
        System.out.println(conjuntoAleatorio);

        

        // Medir tiempo de inserción para cada Set
//        medirTiempoInsercion(new HashSet<>());
//        medirTiempoInsercion(new TreeSet<>());
//        medirTiempoInsercion(new LinkedHashSet<>());
        
        // Medir búsqueda en todos los Sets
//        String elementoBusqueda = "Java";
//        medirTiempoBusqueda(hashSet, elementoBusqueda);
//        medirTiempoBusqueda(treeSet, elementoBusqueda);
//        medirTiempoBusqueda(linkedHashSet, elementoBusqueda);

        // Ejecutar ejemplos prácticos
//        ejemploInventarioProductos();
//        ejemploListadoEstudiantes();
//        ejemploHistorialNavegacion();
    }
    
    private static void mostrarElementosConIterador (Set<String> s) {
    	Iterator it = s.iterator();
    	System.out.println(s.getClass().getSimpleName());
    	int i = 1;
    	while(it.hasNext()) {
    		System.out.println("Elemento: #" + i + it.next());
    		i++;
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }
    
    private static void medirTiempoBusqueda(Set<String> set, String elemento) {
        long inicio = System.nanoTime();
        boolean existe = set.contains(elemento);
        long fin = System.nanoTime();
        
        System.out.println("\nBúsqueda en " + set.getClass().getSimpleName() + ":");
        System.out.println("Elemento '" + elemento + "' encontrado: " + existe);
        System.out.println("Tiempo: " + (fin - inicio) + " nanosegundos");
    }
    
    /**
     * HashSet es ideal para este caso porque:
		No necesitamos orden específico
		Búsqueras ultra rápidas de productos (O(1))
		Eliminación automática de códigos duplicados
     */
    private static void ejemploInventarioProductos() {
        Set<String> codigosProducto = new HashSet<>();
        
        // Simulación: 1000 códigos únicos aleatorios
        for (int i = 0; i < 1000; i++) {
            codigosProducto.add("PROD-" + (int)(Math.random() * 2000));
        }
        
        System.out.println("\n--- Inventario de productos (HashSet) ---");
        System.out.println("¿Contiene PROD-500?: " + codigosProducto.contains("PROD-500"));
        System.out.println("Tamaño del inventario: " + codigosProducto.size());
    }
    /**
     * TreeSet es perfecto aquí porque:
 Mantiene los nombres ordenados automáticamente Permite usar comparadores personalizados (orden inverso)
Ideal para generar listados clasificados
     */
    private static void ejemploListadoEstudiantes() {
        Set<String> estudiantes = new TreeSet<>(Comparator.reverseOrder());
        
        estudiantes.add("María Pérez");
        estudiantes.add("Juan García");
        estudiantes.add("Ana López");
        estudiantes.add("Pedro Martínez");
        
        System.out.println("\n--- Listado de estudiantes (TreeSet) ---");
        System.out.println("Orden descendente:");
        estudiantes.forEach(System.out::println);
        
        // Mostrar primeros 2 estudiantes
        System.out.println("\nPrimeros 2 estudiantes:");
        Iterator<String> it = estudiantes.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
    }
    /**
     * LinkedHashSet funciona mejor aquí porque:
Mantiene el orden cronológico de visita
Elimina duplicados pero preserva la primera ocurrencia
Permite recorrer el historial en el orden natural de navegación
     */
    private static void ejemploHistorialNavegacion() {
        LinkedHashSet<String> historial = new LinkedHashSet<>();
        
        // Simular navegación con páginas repetidas
        String[] paginas = {"google.com", "wikipedia.org", "github.com", "google.com", "stackoverflow.com"};
        for (String pagina : paginas) {
            historial.add(pagina);
        }
        
        System.out.println("\n--- Historial de navegación (LinkedHashSet) ---");
        System.out.println("Historial completo:");
        historial.forEach(p -> System.out.println("→ " + p));
        
        // Mostrar última página usando iterador
        System.out.println("\nÚltima página visitada:");
        Iterator<String> it = historial.iterator();
        String ultima = "";
        while(it.hasNext()) ultima = it.next();
        System.out.println(ultima);
    }

}

