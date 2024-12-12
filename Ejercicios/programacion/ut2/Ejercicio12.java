
package programacion.ut2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int primerTrimestre;
        int segundoTrimestre;
        int tercerTrimestre;
        int notaFinal;
        double notaExpediente;
        System.out.print("Escribe la nota final del 1º Trimestre: ");
        primerTrimestre = 1;
        System.out.print("Escribe la nota final del 2º Trimestre: ");
        segundoTrimestre = 2;
        System.out.print("Escribe la nota final del 3º Trimestre: ");
        tercerTrimestre = 4;
        notaExpediente = ((primerTrimestre + segundoTrimestre + tercerTrimestre) / 3f);
        notaFinal = (int)notaExpediente;
        System.out.println("Nota boletin: " + notaFinal );
        System.out.println("Nota Expediente academico " + notaExpediente);
    }
}
