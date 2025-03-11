package programacion.ut4.ejemplos;


import programacion.ut4.ejercicios.Persona;

public class EjemploPasoValorReferencia {

	public static void main(String[] args) {
		Persona persona = new Persona("Fran", 30);
		Persona personaCopia = viajarEnElTiempo(persona, 1);
		System.out.println(persona);
		System.out.println(personaCopia);

	}
	
	static Persona viajarEnElTiempo(Persona persona, int distanciaAnyos) {
		persona.setEdad(persona.getEdad() + distanciaAnyos);
		
		Persona personaCopia = new Persona(persona.getNombre(), persona.getEdad());
		return personaCopia;
	}

}
