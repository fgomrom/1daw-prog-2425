classDiagram
   class Persona {
       -String nombre
       -int edad
       -Genero genero
       -static int contadorPersonas
       +Persona(String, int, Genero)
       +Persona(String)
       +getNombre() String
       +setNombre(String) void
       +getEdad() int
       +setEdad(int) void
       +getGenero() Genero
       +setGenero(Genero) void
       +toString() String
       +equals(Object) boolean
       +static getTotalPersonas() int
   }


   class Genero {
       <<enumeration>>
       MASCULINO
       FEMENINO
       OTRO
   }


   class Estudiante {
       -String matricula
       -String carrera
       +Estudiante(String, int, Genero, String, String)
       +toString() String
   }


   class Evaluable {
       <<interface>>
       +calificar() double
   }


   class Curso {
       <<abstract>>
       -String nombreCurso
       -int duracionHoras
       +Curso(String, int)
       +mostrarInfoCurso() void
       +calificar() double
   }


   class CursoPresencial {
   	-String ubicacion
       +CursoPresencial(String, int)
       +CursoPresencial(String)
       +mostrarInfoCurso() void
       +calificar() double
   }
   
   class CursoOnline {
   -String plataforma
       +CursoPresencial(String, int)
       +CursoPresencial(String)
       +mostrarInfoCurso() void
       +calificar() double
   }


   class Academia {
       - Estudiante[] estudiantes
       - Curso[] cursos
       +agregarEstudiante(Estudiante) void
       +eliminarEstudiante(Estudiante) void
       +listarEstudiantes() void
       +agregarCurso(Curso) void
       +eliminarCurso(Curso) void
       +listarCursos() void
       +modificarValores(int, Persona) void
   }


   Persona <|-- Estudiante
   Curso ..|> Evaluable
   Curso <|-- CursoPresencial
   Curso <|-- CursoOnline
   Academia "1" *-- "many" Estudiante : contiene
   Academia "1" *-- "many" Curso : contiene