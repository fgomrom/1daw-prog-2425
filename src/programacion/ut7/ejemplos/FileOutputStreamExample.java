package programacion.ut7.ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
			File file = new File("c:\\Users\\Fran Gómez\\ejemplo.bin");
			fos = new FileOutputStream(file);
			fos.write((byte)'b');
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fos.close();
		}
	}

}
