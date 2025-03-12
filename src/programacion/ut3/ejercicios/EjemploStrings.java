package programacion.ut3.ejercicios;

public class EjemploStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola corazón: \u2661");
		
		// Escapar
		System.out.println("Hola \"Fr\tan\"");
		System.out.println("Hola \"Francisco\"\r");
		
		// Convertir
		int i = 65;
		char c = (char)i;
		System.out.println(c);
		
		char d = 'A';
		int e = d;
		System.out.println(e);
		
		// Convetir int a String
		int j = 123;
		String s = String.valueOf(j);
		
		// Comparar cadenas
		String cad1 = "Hola";
		String cad2 = "Hola";
		System.out.println(cad1 == cad2);
		// Tipos primitivos sí se usa ==
		// porque no tienen métodos
		int e1 = 1;
		int e2 = 1;
		System.out.println(e1 == e2);
		
		// Comparar cad1 y cad2 con equals
		System.out.println(cad1.equals(cad2));
		
		// Probar método comparteTo
		int comparacion;
		// Cadenas iguales
		comparacion = "Hola".compareTo("Hola");
		// Cadena invocante menor
		//comparacion = "Casa".compareTo("Dedo");
		// Cadena invocante mayor
		//comparacion = "Dedo".compareTo("Casa");
		if (comparacion == 0) {
			System.out.println("Son iguales");
		} else if (comparacion < 0) {
			System.out.println("Primera menor");
		} else {
			System.out.println("Primer mayor");			
		}
		
		System.out.println("Hola Fran".indexOf("Fran"));
		
		"".isEmpty();
		"Hola Fran".contains("Pepito");
		"asdf".replace("a","b");
		"asdfasd".toUpperCase();
		"aaabffff".split("b");
		
	}

}
