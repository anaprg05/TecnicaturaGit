// Ejercicio Práctica 2 - Clase 6:
//  Indicar si el usuario es mayor de edad o no.

package Clase6;

import java.util.Scanner;


public class EjercicioPractica2_Clase6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(entrada.nextLine()); 
        var adulto = edad >= 18;
        if (adulto){
            System.out.println("Usted es mayor de edad.");
        }
        else{
            System.out.println("Usted es menor de edad.");
        }
    }
}
