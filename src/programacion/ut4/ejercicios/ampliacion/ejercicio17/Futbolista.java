package programacion.ut4.ejercicios.ampliacion.ejercicio17;

public class Futbolista extends Deportista {
	private String posicion;
	private int golesMarcados;

	public Futbolista(String nombre, int edad, String posicion) {
		super(nombre, edad, "Fútbol");
		this.posicion = posicion;
		this.golesMarcados = 0;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int goles) {
		this.golesMarcados = goles;
	}

	public void anotarGol() {
		this.golesMarcados++;
	}

	@Override
	public String toString() {
		return super.toString() + " Futbolista{posicion='" + posicion + "', golesMarcados=" + golesMarcados + "}";
	}
}
