package ut4;

public class Empleado extends Persona{
	private double salario;
	
	Empleado (double salario, String nombre) {
		this.salario = salario;
		super.nombre = nombre;
	}
	
	double getSalario() {
		return salario;
	}
	
	@Override
	void mostrarDatos() {
		super.mostrarDatos();
		System.out.println(salario);
	}
	
	@Override
	void saludar () {
		
	}
	
	
}
