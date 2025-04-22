package programacion.ut5.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio14 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		System.out.println(numeros);
		Collections.shuffle(numeros);
		System.out.println(numeros);
		Collections.sort(numeros);
		System.out.println(numeros);
		Collections.reverse(numeros);
		System.out.println(numeros);
		System.out.println(Collections.binarySearch(numeros, 3));
		numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	}

}
