package programacion.ut2;

public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.println("Máximo de 2 números: " + maximo(10,20));
        System.out.println("Máximo de 3 números: " + maximo(20,25,20));
    }
    
    public static int maximo (int x, int y) {
        return x > y ? x : y;
    }
    
    public static int maximo (int x, int y, int z) {
        return maximo(x, maximo(y,z));
    }
}