package programacion.ut4.examen;

public abstract class Curso {
	protected String nombreCurso;
    protected int duracionHoras;

    public Curso(String nombreCurso, int duracionHoras) {
        this.nombreCurso = nombreCurso;
        this.duracionHoras = duracionHoras;
    }

    public abstract void mostrarInfoCurso();
    public abstract double calificar();

}
