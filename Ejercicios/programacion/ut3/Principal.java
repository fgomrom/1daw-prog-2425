package programacion.ut3;

import static programacion.ut3.EjemploTablas.*;

/**
 * Algoritmo principal que invoca al resto de métodos de la unidad 3
 * 
 * @author Fran
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;

        
        // Generar la escalera
        for (int i = 1; i <= n; i++) {
            // Imprimir los números de 1 a i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

    }
    
}
