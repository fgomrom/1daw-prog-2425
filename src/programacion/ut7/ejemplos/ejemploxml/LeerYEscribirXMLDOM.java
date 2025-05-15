package programacion.ut7.ejemplos.ejemploxml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;public class LeerYEscribirXMLDOM {
	public static void main(String[] args) throws Exception, Error {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("C:\\Users\\Fran Gómez\\1daw-prog-2425\\src\\programacion\\ut7\\ejemplos\\ejemploxml\\alumnos.xml"));

		NodeList lista = doc.getElementsByTagName("alumno");
		for (int i = 0; i < lista.getLength(); i++) {
		    Element alumno = (Element) lista.item(i);
		    String nombre = alumno.getElementsByTagName("nombre").item(0).getTextContent();
		    String nota = alumno.getElementsByTagName("nota").item(0).getTextContent();
		    System.out.println(nombre + " - " + nota);
		}

		// Añadir nuevo alumno
		Element nuevo = doc.createElement("alumno");
		nuevo.setAttribute("id", "3");
		Element nombre = doc.createElement("nombre");
		nombre.setTextContent("Lucía");
		Element nota = doc.createElement("nota");
		nota.setTextContent("10");
		nuevo.appendChild(nombre);
		nuevo.appendChild(nota);
		doc.getDocumentElement().appendChild(nuevo);

		// Guardar cambios
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("alumnos_modificado.xml"));
		transformer.transform(source, result);


	}

}
