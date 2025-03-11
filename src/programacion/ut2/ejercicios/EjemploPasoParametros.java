package programacion.ut2.ejercicios;

public class EjemploPasoParametros {
    
    // Método que intenta cambiar el valor de un número
    public static void cambiarValor(int numero) {
        numero = 20; // Cambiamos el valor de 'numero' dentro del método
        System.out.println("Dentro de cambiarValor: " + numero); // Imprime 20
    }

    public static void main(String[] args) {
        int numeroOriginal = 10; // Valor inicial de la variable
        System.out.println("Antes de llamar a cambiarValor: " + numeroOriginal); // Imprime 10

        // Llamada al método cambiarValor
        cambiarValor(numeroOriginal);

        // Verificamos si el valor de numeroOriginal cambió
        System.out.println("Después de llamar a cambiarValor: " + numeroOriginal); // Imprime 10
    }
}
