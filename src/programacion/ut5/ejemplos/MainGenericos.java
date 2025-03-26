package programacion.ut5.ejemplos;

public class MainGenericos {

	public static void main(String[] args) {
		// Creating an instance with String type
        GenericBox<String> genericData = new GenericBox<>("Hello, Generics!");

        // Retrieving the data
        String message = genericData.getContent();

        // Displaying the output
        System.out.println(message);
        
        // Evita el uso de casting explícito
        
        // Without Generics
        Object obj = genericData.getContent();
        String str = (String) obj;
        
        // With Generics
        str = genericData.getContent();
	}

}
