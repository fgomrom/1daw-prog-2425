package programacion.ut4.ejercicios.ampliacion.ejercicio17;

public class EntrenamientoFutbol extends Entrenamiento implements Compite {
	private String tipoEntrenamiento;

    public EntrenamientoFutbol() {
        this("General"); // Uso de this para llamar a otro constructor
    }

    public EntrenamientoFutbol(String tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }

    public void setTipoEntrenamiento(String tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento; // Uso de this para diferenciar el atributo del parámetro
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando fútbol... Tipo: " + this.tipoEntrenamiento);
    }

    @Override
    public String competir() {
        return "El futbolista está compitiendo en un partido";
    }

    public void cambiarYEntrenar(String nuevoTipo) {
        this.setTipoEntrenamiento(nuevoTipo); // Uso de this para llamar a otro método de la misma clase
        this.entrenar();
    }
}

