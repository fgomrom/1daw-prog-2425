package programacion.ut5.proyectos.proyecto1;

import java.util.*;

public class CentroDistribucion {
    private final Set<String> codigosProcesados = new HashSet<>();
    private final PriorityQueue<Paquete> colaPrioridad;
    private long contadorLlegadas = 0;

    public CentroDistribucion() {
        colaPrioridad = new PriorityQueue<>(new Comparator<Paquete>() {
            @Override
            public int compare(Paquete p1, Paquete p2) {
                if (p1.getPrioridad() != p2.getPrioridad()) {
                    return Integer.compare(p1.getPrioridad(), p2.getPrioridad());
                }
                return Long.compare(p1.getOrdenLlegada(), p2.getOrdenLlegada());
            }
        });
    }

    public void registrarPaquete(String codigo, double peso, String destino, int prioridad) {
        if (codigosProcesados.contains(codigo)) {
            System.out.println("Paquete ya registrado: " + codigo);
            return;
        }

        Paquete p = new Paquete(codigo, peso, destino, prioridad, contadorLlegadas++);
        colaPrioridad.add(p);
        codigosProcesados.add(codigo);
    }

    public void procesarPaquete() {
        if (colaPrioridad.isEmpty()) {
            System.out.println("No hay paquetes para procesar.");
            return;
        }

        Paquete p = colaPrioridad.poll();
        System.out.println("Procesando paquete: " + p);
    }

    public void mostrarCola() {
        System.out.println("Cola de paquetes por prioridad y llegada:");
        colaPrioridad.stream().sorted(Comparator
            .comparingInt(Paquete::getPrioridad)
            .thenComparingLong(Paquete::getOrdenLlegada))
            .forEach(System.out::println);
    }
}

