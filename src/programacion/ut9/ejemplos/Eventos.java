package programacion.ut9.ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Eventos {

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

		botonSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((Frame) botonSalir.getParent()).dispose();
			}
		});

		botonLimpiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText("");
			}
		});

		marco.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				marco.dispose();
			}
		});
	}

}
