package programacion.ut3;

/**
 * Ejemplo de crear una matriz
 */
public class EjemploMatriz {

	public static void main(String[] args) {
		int[][] m = new int[3][2];
		m[0][0] = 1;
		m[0][1] = 2;
		m[1][0] = 3;
		m[1][1] = 4;
		m[2][0] = 5;
		m[2][1] = 6;
		System.out.println(m);
		System.out.println(m[0]);
		System.out.println(m[0][0]);
		
		
		//int naturales[] = {1,2,3,4,5};
		// Inicializar el array con el nº 1
		int naturales[] = new int[5];
		for (int i : naturales) {
			naturales[i] = 1;
		}
		
		
		for (int x : naturales) {
			System.out.println(x);
		}
		for (int i = 0; i < naturales.length; i++) {
			System.out.println(naturales[i]);
		}
		
		// Sumar todos los números del array naturales.
		
		
	}

}
