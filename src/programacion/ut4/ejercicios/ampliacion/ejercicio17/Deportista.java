package programacion.ut4.ejercicios.ampliacion.ejercicio17;

public class Deportista {
	private String nombre;
	private int edad;
	private String deporte;
	private static int totalDeportistas = 0;
	
	
	public void valorReferencia(int edad, Deportista deportista) {
		edad++;
		deportista.edad++;
	}

	public Deportista(String nombre, int edad, String deporte) {
		this.nombre = nombre;
		this.edad = edad;
		this.deporte = deporte;
		totalDeportistas++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public static int getTotalDeportistas() {
		return totalDeportistas;
	}

	@Override
	public String toString() {
		return "Deportista{nombre='" + nombre + "', edad=" + edad + ", deporte='" + deporte + "'}";
	}
}
