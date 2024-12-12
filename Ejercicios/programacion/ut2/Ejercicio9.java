package programacion.ut2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        boolean llueve, finalizadoTareas, irBiblioteca, salir;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Está lloviendo? (true/false)");
        llueve = sc.nextBoolean();
        System.out.println("¿Has finalizado las tareas? (true/false)");
        finalizadoTareas = sc.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca? (true/false)");
        irBiblioteca = sc.nextBoolean();
        salir = !llueve && finalizadoTareas || irBiblioteca;
        System.out.println(salir);
    }
    
}
