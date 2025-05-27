package programacion.ut9.ejercicios;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio2 {

	public static void main(String[] args) {
		Frame marco = new Frame("Ejercicio 2");
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
				((TextField) marco.getComponentAt(30, 70)).setText("");
			}
		});

		marco.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				marco.dispose();
			}
		});

		Frame marcoFichero = new Frame();
		Button b = new Button("Abrir");
		Label l = new Label("No has seleccionado fichero.");
		b.setBounds(30, 30, 50, 30);
		l.setBounds(90, 30, 220, 30);
		marcoFichero.add(b);
		marcoFichero.add(l);
		FileDialog fd = new FileDialog(marcoFichero, "Elige un fichero", FileDialog.LOAD);
		fd.setDirectory("C:\\carpeta_ficheros");
		fd.setFile("*.txt");

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fd.setVisible(true);
				if (fd.getFile() != null)
					l.setText(fd.getDirectory() + fd.getFile());
			}
		});
		
		marcoFichero.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				marco.dispose();
			}
		});

		marcoFichero.setLayout(null);
		marcoFichero.setSize(300, 80);
		marcoFichero.setVisible(true);
	}

}
