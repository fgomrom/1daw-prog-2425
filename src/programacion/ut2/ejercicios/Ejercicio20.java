package programacion.ut2.ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Declaración de variables
        int max, min;
        int edad;
        Scanner sc = new Scanner(System.in);
        
        // Inicialización de la edad del primer alumno y del máximo y mínimo
        System.out.println("Introduzca edad del primer alumno: ");
        edad = sc.nextInt();
        max = edad;
        min = edad;
        // Introducir edades hasta que se introduzca -1
        while (edad != -1) {
            System.out.println("Introduzca edad del siguiente alumno o -1 para salir: ");
            edad = sc.nextInt();
            // Calcular el máximo
            if (edad > max) {
                max = edad;
            }
            // Calcular el mínimo
            if (edad < min) {
                min = edad;
            }
        }
        // Imprimir máximo y mínimo
        System.out.println("Máxima edad: " + max + "\nMínima edad: " + min);
    }
    
}
