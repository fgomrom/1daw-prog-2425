package programacion.ut5.ejemplos;

public class EjemploInmutables {

	public static void main(String[] args) {
		String s = "Hola";
		String sNuevo = s.concat(" Fran");
		System.out.println(s);
		System.out.println(sNuevo);
		
		sNuevo = s + "Fran";
		System.out.println(s);
		System.out.println(sNuevo);
		
		Integer x = 100;
		Integer y = x;

		modificarValor(x);

		System.out.println("x = " + x);
		System.out.println("y = " + y);


	}
	
	public static void modificarValor(Integer num) {
		num = num + 1;
	}

}
