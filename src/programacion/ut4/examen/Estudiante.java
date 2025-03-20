package programacion.ut4.examen;

public class Estudiante extends Persona {
	private String matricula;
	private String carrera;

	public Estudiante(String nombre, int edad, Genero genero, String matricula, String carrera) {
		super(nombre, edad, genero);
		this.matricula = matricula;
		this.carrera = carrera;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + carrera + " (" + matricula + ")";
	}
}
