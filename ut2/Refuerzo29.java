package programacion.ut2;

import java.util.Scanner;

/**
 *
 * Ejercicio 29 Un centro de investigación de la flora urbana necesita una
 * aplicación que muestre cuál es el árbol más alto. Para ello se introducirá
 * por teclado la altura (en centímetros) de cada árbol (terminando la
 * introducción de datos cuando se utilice -1 como altura). Los árboles se
 * identifican mediante etiquetas con números únicos correlativos, comenzando en
 * 0. Diseñar una aplicación que resuelva el problema planteado.
 *
 */

public class Refuerzo29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n:");
        int n = sc.nextInt();
        int alturaMayor = n;
        int etiquetaArbolMayor = 0;
        int j = 0;
        while (n != -1) {
            if (n > alturaMayor) {
                alturaMayor = n;
                etiquetaArbolMayor = j;
            }
            System.out.println("Intro n:");
            n = sc.nextInt();
            j++;
        }
        System.out.println("El mayor es el: "+etiquetaArbolMayor+" que mide: "+alturaMayor);
        
        System.out.println("Intro n:");
        n = sc.nextInt();
        for (int i = 0; n != -1; i++) {
            if (n > alturaMayor) {
                alturaMayor = n;
                etiquetaArbolMayor = i;
            }
            System.out.println("Intro n:");
            n = sc.nextInt();
        }
        System.out.println("El mayor es el: "+etiquetaArbolMayor+" que mide: "+alturaMayor);
    }
    
}
