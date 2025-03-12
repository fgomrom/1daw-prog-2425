package programacion.ut3.ejercicios;

/**
 * Crear una tabla de longitud 10 que se inicializará con números aleatorios
 * comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios
 * que se guardan en la tabla.
 * 
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int[] aleatorios = new int[10];
		for (int i = 0; i < aleatorios.length; i++) {			
			aleatorios[i] = (int)Math.random()*100;
		}
		EjemploImprimir.imprimir(aleatorios);
	}

}
