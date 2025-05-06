package programacion.ut6.ejercicios.ejercicio6;

import java.util.Scanner;

public class AccesoArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un índice (0-4): ");
            int indice = scanner.nextInt();
            System.out.println("Valor en el índice " + indice + ": " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        } finally {
            scanner.close();
        }
    }
}

