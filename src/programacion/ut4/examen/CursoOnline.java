package programacion.ut4.examen;

/** 
 * Creo esta clase para aplicar polimorfismo
 */
public class CursoOnline extends Curso implements Evaluable {
	private String plataforma;
	public CursoOnline(String nombreCurso, int duracionHoras) {
		super(nombreCurso, duracionHoras);
	}

	public CursoOnline(String nombreCurso) {
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

	protected String getPlataforma() {
		return plataforma;
	}

	protected void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
}
