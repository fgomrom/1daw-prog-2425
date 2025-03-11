// Clase ContadorObjetos
public class ContadorObjetos {
    // Atributo estático
    private static int totalObjetos = 0;

    // Constructor
    public ContadorObjetos() {
        totalObjetos++; // Incrementa el contador estático al crear un objeto
    }

    // Método estático para mostrar el total de objetos creados
    public static void mostrarTotalObjetos() {
        System.out.println("Total de objetos creados: " + totalObjetos);
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear objetos
        ContadorObjetos obj1 = new ContadorObjetos();
        ContadorObjetos obj2 = new ContadorObjetos();
        ContadorObjetos obj3 = new ContadorObjetos();

        // Llamar al método estático
        ContadorObjetos.mostrarTotalObjetos(); // Debe mostrar: Total de objetos creados: 3
    }
}
