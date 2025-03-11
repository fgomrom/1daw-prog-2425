package programacion.ut4.ejercicio7;

import programacion.ut4.ejercicio7.maquinaria.Locomotora;
import programacion.ut4.ejercicio7.maquinaria.Tren;
import programacion.ut4.ejercicio7.personal.Espe;
import programacion.ut4.ejercicio7.personal.Mecanico;
import programacion.ut4.ejercicio7.personal.Mecanico.Especialidad;

public class Main {

	public static void main(String[] args) {
		
		Mecanico mecanico = new Mecanico("pepito", 10, frenos);
		
		Locomotora locomotora = new Locomotora("aaaa", 10, 30, );
		
		Tren miTren = new Tren(locomotora, maquinista);

	}

}
