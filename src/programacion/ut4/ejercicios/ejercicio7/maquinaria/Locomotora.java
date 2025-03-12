package programacion.ut4.ejercicios.ejercicio7.maquinaria;

import programacion.ut4.ejercicios.ejercicio7.personal.Mecanico;

public class Locomotora {
	String matricula;
	int potencia;
	int añoFabricacion;
	Mecanico mec;
	
	public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.añoFabricacion = añoFabricacion;
		this.mec = mec;
	}
}
