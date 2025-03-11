package programacion.ut2.ejercicios;

public class EjemploAnidados {
    public static void main(String[] args) {
        int j;
        for (int i = 1; i <= 3; i++) {
            System.out.print("i: " + i);
            j = 1;
            while (j <= i) {
                System.out.print("\tj: " + j);
                j++;
            }
            System.out.println("");
        }
    }
}
