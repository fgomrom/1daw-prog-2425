package programacion.ut4.examen;

public class Main {
	public static void main(String[] args) {
		Academia academia = new Academia();

		// Creación de estudiantes
		Estudiante e1 = new Estudiante("Carlos", 20, Genero.MASCULINO, "A123", "Informática");
		Estudiante e2 = new Estudiante("María", 22, Genero.FEMENINO, "B456", "Diseño Web");

		academia.agregarEstudiante(e1);
		academia.agregarEstudiante(e2);
		academia.listarEstudiantes();

		// Creación de cursos
		Curso cursoOnline = new CursoOnline("Java Avanzado", 200);
        Curso cursoPresencial = new CursoPresencial("Diseño UX", 100);

		academia.agregarCurso(cursoOnline);
		academia.agregarCurso(cursoPresencial);
		academia.listarCursos();

		// Casting explícito: Acceder a métodos específicos de una subclase
        if (cursoOnline instanceof CursoOnline) {
            CursoOnline co = (CursoOnline) cursoOnline;
            System.out.println("Accediendo a plataforma del curso online: " + co.getPlataforma());
        }

        if (cursoPresencial instanceof CursoPresencial) {
            CursoPresencial cp = (CursoPresencial) cursoPresencial;
            System.out.println("El curso presencial se imparte en: " + cp.getUbicacion());
        }

		// Ejemplo de paso por referencia
		System.out.println("\nAntes de modificar: " + e1);
		academia.modificarValores(25, e1);
		System.out.println("Después de modificar: " + e1);

		// Evaluar curso
		System.out.println("\nCalificación del curso:");
		System.out.println("Curso: " + cursoPresencial.nombreCurso + " - Nota: " + cursoPresencial.calificar());
	}
}
