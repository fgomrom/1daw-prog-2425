package programacion.ut5.proyectos.proyecto4;

import java.time.LocalDate;
import java.util.Objects;

public class Muestra implements Comparable<Muestra> {
    private final String id;
    private final String tipoAnalisis;
    private final double valor;
    private final LocalDate fecha;

    public Muestra(String id, String tipoAnalisis, double valor, LocalDate fecha) {
        this.id = id;
        this.tipoAnalisis = tipoAnalisis;
        this.valor = valor;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public String getTipoAnalisis() {
        return tipoAnalisis;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return String.format("Muestra{id='%s', tipo='%s', valor=%.2f, fecha=%s}", 
                             id, tipoAnalisis, valor, fecha);
    }

    @Override
    public int compareTo(Muestra otra) {
        return this.fecha.compareTo(otra.fecha);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Muestra muestra)) return false;
        return id.equals(muestra.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

