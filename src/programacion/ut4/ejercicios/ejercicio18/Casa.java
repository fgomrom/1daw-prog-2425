package programacion.ut4.ejercicios.ejercicio18;

public class Casa {
	Bombilla[] bombillas;
	boolean interruptorEncendido;
	
	Casa (int numBombillas) {
		bombillas = new Bombilla[numBombillas];
	}
	
	void encenderBombilla(int n) {
		bombillas[n].setEstado(true && interruptorEncendido);
	}
	
	void apagarBombilla(int n) {
		bombillas[n].setEstado(false);
	}
}
