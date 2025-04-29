package programacion.ut5.proyectos.proyecto4;

import java.time.LocalDate;

public class Proyecto4 {
    public static void main(String[] args) {
        Laboratorio lab = new Laboratorio();

        lab.registrarMuestra(new Muestra("A001", "Sangre", 4.5, LocalDate.of(2025, 4, 10)));
        lab.registrarMuestra(new Muestra("A002", "Orina", 2.3, LocalDate.of(2025, 4, 12)));
        lab.registrarMuestra(new Muestra("A003", "Sangre", 5.1, LocalDate.of(2025, 4, 9)));
        lab.registrarMuestra(new Muestra("A001", "Sangre", 4.5, LocalDate.of(2025, 4, 10))); // Duplicada

        lab.mostrarPorFecha();
        System.out.println();
        lab.mostrarPorTipo("Sangre");
    }
}

