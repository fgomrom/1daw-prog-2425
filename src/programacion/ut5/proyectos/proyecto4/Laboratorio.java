package programacion.ut5.proyectos.proyecto4;

import java.util.*;

public class Laboratorio {
    private final List<Muestra> listaMuestras = new ArrayList<>();
    private final Set<String> idsProcesados = new HashSet<>();
    private final Map<String, List<Muestra>> muestrasPorTipo = new HashMap<>();
    private final TreeSet<Muestra> muestrasOrdenadas = new TreeSet<>();

    public void registrarMuestra(Muestra muestra) {
        if (idsProcesados.contains(muestra.getId())) {
            System.out.println("Muestra ya procesada: " + muestra.getId());
            return;
        }

        listaMuestras.add(muestra);
        idsProcesados.add(muestra.getId());
        muestrasOrdenadas.add(muestra);

        muestrasPorTipo
            .computeIfAbsent(muestra.getTipoAnalisis(), k -> new ArrayList<>())
            .add(muestra);
    }

    public void mostrarPorFecha() {
        System.out.println("Muestras ordenadas por fecha:");
        for (Muestra m : muestrasOrdenadas) {
            System.out.println(m);
        }
    }

    public void mostrarPorTipo(String tipo) {
        System.out.println("Muestras del tipo: " + tipo);
        List<Muestra> muestras = muestrasPorTipo.getOrDefault(tipo, List.of());
        for (Muestra m : muestras) {
            System.out.println(m);
        }
    }
}
