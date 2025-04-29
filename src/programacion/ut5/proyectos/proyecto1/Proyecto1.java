package programacion.ut5.proyectos.proyecto1;

public class Proyecto1 {
    public static void main(String[] args) {
        CentroDistribucion centro = new CentroDistribucion();

        centro.registrarPaquete("P001", 2.5, "Madrid", 2);
        centro.registrarPaquete("P002", 1.8, "Sevilla", 1);
        centro.registrarPaquete("P003", 3.0, "Barcelona", 3);
        centro.registrarPaquete("P001", 2.5, "Madrid", 2); // Duplicado

        centro.mostrarCola();

        System.out.println("\n--- Procesamiento ---");
        centro.procesarPaquete();
        centro.procesarPaquete();
    }
}

