package programacion.ut3.ejercicios;

public class EjemploImprimir {

	public static void main(String[] args) {
		int[] a = {2,4,6,8,10};
		// Imprime la referencia
		System.out.println(a);
		// Imprime el contenido
		imprimir(a);
		// Imprime contenido con for-each
		for (int e : a) 
			System.err.println(e);
	}

	/**
	 * Imprime un array de enteros
	 * @param a array de enteros
	 */
	public static void imprimir(int[] a) {
		System.out.print("{");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.print(a[a.length - 1]);
		System.out.print("}");
	}
	
	/**
	 * Imprime un array de enteros
	 * @param a array de enteros
	 */
	public static void imprimirInvertido(int[] a) {
		System.out.print("{");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.print(a[a.length - 1]);
		System.out.print("}");
	}
	

}
