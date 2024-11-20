package programacion.ut2;

import java.util.Scanner;

public class Ampliacion44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n:");
        int n = sc.nextInt();
        int numPrimos = 0;
        
        for (int i = 0; i < n; i++) {
            if (esPrimo(n))
                numPrimos++;
        }
        
        System.out.println("Entre " + n + " y " + 1 + " hay " + numPrimos);
    }
    
    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        int i = 2;
        if (n < 2) {
            esPrimo = false;
        }
        while (i < Math.sqrt(n) && esPrimo) {
            if (n % i == 0) {
                esPrimo = false;
            }
            i++;
        }
        return esPrimo;
    }
    
}
