package programacion.ut5.proyectos.proyecto1;

public class Paquete {
    private final String codigo;
    private final double peso;
    private final String destino;
    private final int prioridad; // 1 = Alta, 2 = Media, 3 = Baja
    private final long ordenLlegada;

    public Paquete(String codigo, double peso, String destino, int prioridad, long ordenLlegada) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
        this.prioridad = prioridad;
        this.ordenLlegada = ordenLlegada;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getDestino() {
        return destino;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public long getOrdenLlegada() {
        return ordenLlegada;
    }

    @Override
    public String toString() {
        return String.format("Paquete{codigo='%s', peso=%.2f, destino='%s', prioridad=%d, ordenLlegada=%d}",
                codigo, peso, destino, prioridad, ordenLlegada);
    }

    // equals y hashCode si necesitas evitar duplicados
}

