package programacion.ut4;

import programacion.ut4.ejercicio5.Sexo;

class Fiesta {

	public static void main(String[] args) {
		Persona pepe = new Persona();

		pepe.setSexo(Sexo.HOMBRE);
		pepe.setNombre("Pepito");
		System.out.println("El sexo de " + pepe.getNombre() + " es "+ pepe.getSexo());
		
	}

}
