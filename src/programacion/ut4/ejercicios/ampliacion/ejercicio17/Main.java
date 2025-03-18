package programacion.ut4.ejercicios.ampliacion.ejercicio17;

public class Main {
	public static void main(String[] args) {
		
		// Prueba para Ejercicio 7
		int edad = 23;
		Deportista deportista = new Futbolista("Lionel Messi", 34, "Delantero");
		deportista.valorReferencia(edad, deportista);
		System.out.println(edad);
		System.out.println(deportista.getEdad());
		
		Futbolista futbolista1 = new Futbolista("Lionel Messi", 34, "Delantero");
		Futbolista futbolista2 = new Futbolista("Cristiano Ronaldo", 36, "Delantero");

		futbolista2.setEdad(37);
		futbolista1.anotarGol();

		EntrenamientoFutbol entrenamiento = new EntrenamientoFutbol();
		entrenamiento.entrenar();
		System.out.println(entrenamiento.competir());

		if (futbolista1 instanceof Deportista) {
			System.out.println("Futbolista1 implementa Compite");
		}
		
		if (futbolista1.getClass()==Compite.class) {
			System.out.println("Futbolista1 implementa Compite");
		}

		System.out.println(futbolista1);
		System.out.println(futbolista2);
		System.out.println("Total de deportistas: " + Deportista.getTotalDeportistas());
	}

	public static void modificarEdad(int edad) {
		edad = 25; // Esto no afectará al objeto original
	}

	public static void modificarEdad(Deportista deportista) {
		deportista.setEdad(25); // Esto sí modificará el objeto original
	}
}
