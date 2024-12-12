package programacion.ut2;

public class Ejercicio52Ampliación {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++) {
            System.out.println("a");
        }
        
        int n = 2;
        if (esPrimo(n))
            System.out.println("El número " + n + " es primo");
        else
            System.out.println("El número " + n + " no es primo");
    }

    /**
     * Calcula el primo de un numero n
     * @param n este el numero a calcular
     * @return true si es primo y false si no
     */
    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        int i = 2;
        if (n < 2) {
            esPrimo = false;
        }
        while (i < Math.sqrt(n) && esPrimo) {
            if (n % i == 0) {
                esPrimo = false;
            }
            i++;
        }
        return esPrimo;
    }
}
