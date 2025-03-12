package programacion.ut3.ejercicios;
/**
 * sdfgsdfg
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Declarar e inicializar arrays
		int[] enteros;
		enteros = new int[5];
		enteros[0] = 19;
		enteros[1] = 21;
		enteros[2] = 18;
		enteros[3] = 20;
		enteros[4] = 21;	
		
		// Referencias
		System.out.println(enteros);

		metodo(enteros);
		
		System.out.println(enteros[0]);
	}
	
	static void metodo(int[] x) {
		System.out.println(x);
		x[0]=33;
	}

}
