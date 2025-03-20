package programacion.ut4.examen;

public class Persona {
	private String nombre;
	private int edad;
	private Genero genero;
	private static int contadorPersonas = 0;

	public Persona(String nombre, int edad, Genero genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		contadorPersonas++;
	}

	public Persona(String nombre) {
		this(nombre, 0, Genero.OTRO);
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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public static int getTotalPersonas() {
		return contadorPersonas;
	}

	@Override
	public String toString() {
		return nombre + " (" + edad + " años, " + genero + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Persona persona = (Persona) obj;
		return nombre.equals(persona.nombre) && edad == persona.edad && genero == persona.genero;
	}
}
