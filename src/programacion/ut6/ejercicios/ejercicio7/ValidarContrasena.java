package programacion.ut6.ejercicios.ejercicio7;

import java.util.Scanner;

class ContrasenaInvalidaException extends Exception {
    public ContrasenaInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class ValidarContrasena {
    
    // Método que valida y lanza la excepción si es inválida
    public static void validarContrasena(String contrasena) throws ContrasenaInvalidaException {
        if (contrasena.length() < 8) {
            throw new ContrasenaInvalidaException("La contraseña debe tener al menos 8 caracteres.");
        }
        if (!contrasena.matches(".*[A-Z].*")) {
            throw new ContrasenaInvalidaException("La contraseña debe contener al menos una letra mayúscula.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una contraseña: ");
        String contrasena = scanner.nextLine();

        try {
            try {
                validarContrasena(contrasena);
                System.out.println("Contraseña válida.");
            } catch (ContrasenaInvalidaException e) {
                System.out.println("Error al validar: " + e.getMessage());
                throw e; // Repropaga la excepción
            }
        } catch (ContrasenaInvalidaException e) {
            System.out.println("Excepción capturada en el nivel superior: " + e.getMessage());
        }

        scanner.close();
    }
}

