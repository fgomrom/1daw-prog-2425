/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.ut2;

/**
 *
 * @author Fran Gómez
 */
public class Refuerzo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 18;             
        System.out.println(mayorEdad(edad));
    }
    public static String mayorEdad (int edad) {
        return (edad >= 18) ? "Mayor de Edad" : "Menor de Edad";
    }
    
}
