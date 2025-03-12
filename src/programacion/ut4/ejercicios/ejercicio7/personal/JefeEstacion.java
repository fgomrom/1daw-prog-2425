package programacion.ut4.ejercicios.ejercicio7.personal;

import java.time.LocalDateTime;

public class JefeEstacion {
	private String nombre;
	private String dni;
	private LocalDateTime fecha;
	public JefeEstacion(String nombre, String dni, LocalDateTime fecha) {
		this.nombre = nombre;
		this.dni = dni;
		this.fecha = fecha;
	}
}
