package programacion.ut4.ejercicios;

/**
 * @author Fran Gómez
 */
public class Persona {
	// Atributos
	protected String nombre;
	protected int edad;
	protected double estatura;
	protected Sexo sexo;
	// Métodos
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	Persona (String nombre) {
		this(nombre,7,1.8);
		this.nombre = nombre;
	}
	
	public Persona() {
		this.edad = 7;
	}
	
	void mostrarDatos() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(estatura);
	}
	
	void metodo() {
		int edad = 8;
		System.out.println(this.edad);
	}
	void saludar () {
		System.out.println("Hola soy " + nombre);
	}
	void cumplirAnyos() {
		edad ++;
	}
	void crecer (double incremento) {
		estatura = estatura + incremento;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the estatura
	 */
	public double getEstatura() {
		return estatura;
	}

	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
	
	
}
