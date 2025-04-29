package programacion.ut6.ejemplos;

public class Aserciones {
	public static void main (String[] args) {
		// Asegurar que una variable sea positiva
		int x = -15;
		assert x > 0 : "El valor debe ser positivo";
		System.out.println("Valor positivo x: " + x);
		
		// Asegurar que una variaable no sea nula
		String nombre = "Luis";
		assert nombre != null : "El nombre no puede ser nulo";
		System.out.println("El nombre es: "+nombre);
	}

}
