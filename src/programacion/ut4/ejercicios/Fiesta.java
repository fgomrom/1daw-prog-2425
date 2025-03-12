package programacion.ut4.ejercicios;

class Fiesta {

	public static void main(String[] args) {
		Empleado juan = new Empleado(1000, "Juan");
		System.out.println("Empleado: " + juan.getNombre());
		System.out.println("Empleado: " + juan.getSalario());
		juan.mostrarDatos();
	}

}
