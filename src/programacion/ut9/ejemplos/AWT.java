package programacion.ut9.ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class AWT {

	public static void main(String[] args) {
		Frame marco = new Frame("Ejemplo AWT");
		marco.setVisible(true);
		marco.setSize(500, 200);
		marco.setLayout(null);
		
		Button botonSalir = new Button("Salir");
		botonSalir.setBounds(30, 30, 50, 30);
		marco.add(botonSalir);
		
		Button botonLimpiar = new Button("Limpiar");
		botonLimpiar.setBounds(80, 30, 50, 30);
		marco.add(botonLimpiar);
		
		TextField cajaTexto = new TextField("Escribe algo...");
		cajaTexto.setBounds(30, 70, 100, 30);
		marco.add(cajaTexto);
		
	}

}
