package programacion.ut2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int kgPerasPrimerSemestre, kgManzanasPrimerSemestre, kgPerasSegundoSemestre, kgManzanasSegundoSemestre;
        final float precioKgPeras = 1.95f;
        final float precioKgManzanas = 2.35f;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántos kg de peras en el semestre 1º?");
        kgPerasPrimerSemestre = sc.nextInt();
        System.out.println("¿Cuántos kg de peras en el semestre 2º?");
        kgPerasSegundoSemestre = sc.nextInt();
        System.out.println("¿Cuántos kg de manzanas en el semestre 1º?");
        kgManzanasPrimerSemestre = sc.nextInt();
        System.out.println("¿Cuántos kg de manzanas en el semestre 2º?");
        kgManzanasPrimerSemestre = sc.nextInt();
    }
    
}
