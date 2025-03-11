package programacion.ut2.ejercicios;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i--){
            System.out.println("ECO");
        }
        
        
        for (int i = 1; i <= 10; i=i+1) {
            System.out.println(i);
        }
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

}
