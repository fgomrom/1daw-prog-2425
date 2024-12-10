package programacion.ut3;

public class EjemploPasoParametros {

	public static void main(String[] args) {
		int valor = 10;
        cambiarValor(valor);
        System.out.println("Después del método: " + valor); // Imprime 10

        int[] array = {10,12,15,33};
        cambiarArray(array);
        System.out.println("Después del método: " + array[0]); // Imprime 20

	}
	
	public static void cambiarValor(int numero) {
        numero = 20; // No afecta a la variable original
    }

    public static void cambiarArray(int[] array) {
        array[0] = 20; // Afecta al objeto original
    }


}
