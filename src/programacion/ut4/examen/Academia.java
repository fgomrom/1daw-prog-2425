package programacion.ut4.examen;

public class Academia {
	private Estudiante[] estudiantes;
	private Curso[] cursos;
	private int numEstudiantes;
	private int numCursos;
	private static final int MAX_ESTUDIANTES = 3;
	private static final int MAX_CURSOS = 5;

	public Academia() {
		estudiantes = new Estudiante[MAX_ESTUDIANTES];
		cursos = new Curso[MAX_CURSOS];
		numEstudiantes = 0;
		numCursos = 0;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		if (numEstudiantes < MAX_ESTUDIANTES) {
			estudiantes[numEstudiantes++] = estudiante;
			System.out.println("Estudiante agregado: " + estudiante);
		} else {
			System.out.println("No se pueden agregar más estudiantes (límite alcanzado).");
			// También podríamos ampliar el array usando expandirEstudiantes
		}
	}

	public void eliminarEstudiante(Estudiante estudiante) {
		for (int i = 0; i < numEstudiantes; i++) {
			if (estudiantes[i].equals(estudiante)) {
				// Desplazar los elementos
				for (int j = i; j < numEstudiantes - 1; j++) {
					estudiantes[j] = estudiantes[j + 1];
				}
				estudiantes[--numEstudiantes] = null;
				System.out.println("Estudiante eliminado: " + estudiante);
				return;
			}
		}
		System.out.println("Estudiante no encontrado.");
	}

	public void listarEstudiantes() {
		System.out.println("\nEstudiantes en la academia:");
		for (int i = 0; i < numEstudiantes; i++) {
			System.out.println(estudiantes[i]);
		}
	}

	public void agregarCurso(Curso curso) {
		if (numCursos < MAX_CURSOS) {
			cursos[numCursos++] = curso;
			System.out.println("Curso agregado: " + curso);
		} else {
			System.out.println("No se pueden agregar más cursos (límite alcanzado).");
			// También podríamos ampliar el array usando expandirCursos
		}
	}

	public void eliminarCurso(Curso curso) {
		for (int i = 0; i < numCursos; i++) {
			if (cursos[i].equals(curso)) {
				// Desplazar los elementos
				for (int j = i; j < numCursos - 1; j++) {
					cursos[j] = cursos[j + 1];
				}
				cursos[--numCursos] = null;
				System.out.println("Curso eliminado: " + curso);
				return;
			}
		}
		System.out.println("Curso no encontrado.");
	}

	public void listarCursos() {
		System.out.println("\nCursos disponibles:");
		for (int i = 0; i < numCursos; i++) {
			cursos[i].mostrarInfoCurso();
		}
	}

	public void modificarValores(int nuevoValor, Persona persona) {
		persona.setEdad(nuevoValor); // Paso por referencia
	}
	
    private void expandirEstudiantes() {
        int capacidadEstudiantes = estudiantes.length * 2; // Duplico tamaño del array
        Estudiante[] nuevoArray = new Estudiante[capacidadEstudiantes];
        System.arraycopy(estudiantes, 0, nuevoArray, 0, numEstudiantes);
        estudiantes = nuevoArray;
        System.out.println("Capacidad de estudiantes ampliada a " + capacidadEstudiantes);
    }

    private void expandirCursos() {
        int capacidadCursos = cursos.length * 2;
        Curso[] nuevoArray = new Curso[capacidadCursos];
        System.arraycopy(cursos, 0, nuevoArray, 0, numCursos);
        cursos = nuevoArray;
        System.out.println("Capacidad de cursos ampliada a " + capacidadCursos);
    }
}
