// Ejercicio Práctica 1 - Clase 6:
//  Indicar si el usuario es mayor de edad o no.

package Clase6;

public class EjercicioPractica1_Clase6 {
    public static void main(String[] args) {
        var edad = 15;
        var adulto = edad >= 18;
        if (adulto){
            System.out.println("Usted es mayor de edad.");
        }
        else{
            System.out.println("Usted es menor de edad.");
        }
    }
}
