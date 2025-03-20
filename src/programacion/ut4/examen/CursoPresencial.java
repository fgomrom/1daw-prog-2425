package programacion.ut4.examen;

public class CursoPresencial extends Curso implements Evaluable {
	private String ubicacion;
	public CursoPresencial(String nombreCurso, int duracionHoras) {
		super(nombreCurso, duracionHoras);
	}

	public CursoPresencial(String nombreCurso) {
		this(nombreCurso, 40);
	}

	@Override
	public void mostrarInfoCurso() {
		System.out.println("Curso: " + nombreCurso + " - Duración: " + duracionHoras + " horas.");
	}

	@Override
	public double calificar() {
		return Math.random() * 10; // Nota aleatoria entre 0 y 10
	}

	protected String getUbicacion() {
		return ubicacion;
	}

	protected void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
