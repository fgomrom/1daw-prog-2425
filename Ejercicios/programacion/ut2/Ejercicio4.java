package programacion.ut2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        boolean esMayorDeEdad = edad > 18;      
        System.out.println("edad: " + esMayorDeEdad);      
        
    }
}
