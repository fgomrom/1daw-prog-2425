public class Persona {
	// Atributos
	String nombre;
	int edad = 7;
	double estatura;
	// Métodos
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
}
