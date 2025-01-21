package programacion.ut3;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		int[] array3 = {3, 2, 1};
		int[] array4 = {1, 2, 3, 4};

		System.out.println(compararArrays(array1, array2)); // true
		System.out.println(compararArrays(array1, array3)); // false
		System.out.println(compararArrays(array1, array4)); // false

	}
	
	public static boolean compararArrays(int[] array1, int[] array2) {
	    
		boolean resultado = true;
		
		if (array1.length != array2.length) {
			resultado = false; // Diferente tamaño
	    }

		int i = 0;
	    while (i < array1.length && resultado) {
	        if (array1[i] != array2[i]) {
	        	resultado = false; // Elementos diferentes
	        }
	        i++;
	    }
	    
	    return resultado; // Son iguales
	}

}
