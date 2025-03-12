package programacion.ut4.ejercicios.ejercicio7.maquinaria;

import programacion.ut4.ejercicios.ejercicio7.personal.Maquinista;

public class Tren {
	Locomotora locomotora;
	Vagon vagones [];
	Maquinista responsable;
	private int numVagones; //número de vagones que forman el tren
	
	public Tren (Locomotora locomotora, Maquinista responsable) {
		this.locomotora = locomotora;
		this.responsable = responsable;
		vagones = new Vagon [5]; //creamos la tabla de tamaño 5, pero no se
		//crea ningún objeto de tipo Vagón
		numVagones = 0; //por ahora no hay vagones enganchados al tren
	}
	/**
	* Al ser la clase Vagon no visible por clases externas, será la clase Tren la
	* que se encargue de construir el objeto a partir de los datos que nos pasen. */
	public void enganchaVagon (int cargaMax, int cargaActual, String mercancia) {
		if (numVagones >= 5) {
			System.out.println("El tren no admite más vagones");
		} else {
			Vagon v = new Vagon (numVagones, cargaMax, cargaActual, mercancia);
			vagones [numVagones] = v; //el vagón pasado ocupa el último lugar
			numVagones++; //ahora tenemos un vagón más enganchado al tren
		}
	}
}
