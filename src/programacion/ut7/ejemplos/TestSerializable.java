package programacion.ut7.ejemplos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Creo objeto
		ObjetoSerializable o1 = new ObjetoSerializable(1, 1, 1);
		
		// Creo fichero, flujo fichero, flujo objeto, serializo objeto
		File file = new File("c:\\Users\\Fran Gómez\\serializable.bin");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(o1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("c:\\Users\\Fran Gómez\\serializable.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjetoSerializable o1Deserializado = (ObjetoSerializable)ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(o1Deserializado.atributo1);
		System.out.println(o1Deserializado.atributo2);
		System.out.println(o1Deserializado.atributo3);
	}

}
