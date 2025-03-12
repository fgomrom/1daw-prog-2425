package programacion.ut4.ejercicios.ejercicio7.personal;

public class Mecanico {
	private String nombre;
	private int telefono;
	private Especialidad especialidad;
	
	public Mecanico(String nombre, int telefono, String especialidad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = Especialidad.valueOf(especialidad);
	}
	
	public enum Especialidad {
		frenos, hidráulica, electricidad, motor
	}
}

