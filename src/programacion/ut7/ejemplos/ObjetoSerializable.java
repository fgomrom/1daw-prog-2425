package programacion.ut7.ejemplos;

import java.io.Serializable;

public class ObjetoSerializable implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int atributo1; // Es primitivo --> por tanto es serializable
	static int atributo2; // estático no se serializa
	transient int atributo3; // transient no se serializa
	
	public ObjetoSerializable(int atributo1, int atributo2, int atributo3) {
		this.atributo1 = atributo1;
		ObjetoSerializable.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}

}
