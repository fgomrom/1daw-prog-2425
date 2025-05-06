package programacion.ut6.ejercicios.ejercicio8;

// Clase de excepción personalizada
class TemperaturaFueraDeRangoException extends Exception {
	public TemperaturaFueraDeRangoException(String mensaje) {
		super(mensaje);
	}
}

public class SensorTemperatura {

	// Método que comprueba si la temperatura está en rango
	public static void verificarTemperatura(int temp) throws TemperaturaFueraDeRangoException {
		if (temp < -10 || temp > 50) {
			throw new TemperaturaFueraDeRangoException("Temperatura fuera de rango aceptable: " + temp + "°C");
		}
	}

	public static void main(String[] args) {
		int temperatura = 55; // Puedes cambiar este valor para probar

		try {
			verificarTemperatura(temperatura);
			System.out.println("Temperatura dentro del rango seguro.");
		} catch (TemperaturaFueraDeRangoException e) {
			System.out.println("¡Alerta! " + e.getMessage());
		}
	}
}
