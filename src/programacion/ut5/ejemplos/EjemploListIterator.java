package programacion.ut5.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		ListIterator<Integer> lt = lista.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println(lt.previous());
	}

}
