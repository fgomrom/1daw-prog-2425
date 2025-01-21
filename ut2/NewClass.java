package programacion.ut2;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class NewClass {
    public static void main(String[] args) {
        int n =5;

        int numero = 10;
        // Itera desde 2 hasta el número ingresado
        for (int i = 2; i <= numero; i++) {
            // Verifica si el número actual es primo
            if (esPrime(i)) {
                System.out.println(i + " es primo.");
                int compuestos = 0;
                // Cuenta los números compuestos menores que i
                for (int j = 2; j < i; j++) {
                    // Incrementa el contador si j divide a i
                    if (j % i == 0) {
                        compuestos++;
                    }
                }
                // Imprime los números compuestos menores que i
                System.out.println("Números compuestos menores que " + i + ": " + compuestos);
            }
        }
    }
    
    public static boolean esPrime(int num) {
        //Si el numero es menor o igual a 1 esPrimo es igual a false
        if (num <= 1)  return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
