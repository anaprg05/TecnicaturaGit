// Ejercicio 3 - Clase 10: Sistema de calificaciones con if else
//  El objetivo del programa será crear un sistema de calificaciones de la siguiente manera:
//   Pedirle al usuario que ingrese un valor del 0 al 10.
//      Luego, si se ingresa 9 o 10, imprimir A
//      Luego, si se ingresa 8 y menor a 9, imprimir B
//      Luego, si se ingresa 7 y menor a 8, imprimir C
//      Luego, si se ingresa 6 y menor a 7, imprimir D
//      Luego, si se ingresa 0 y menor a 6, imprimir F
//   De lo contrario, imprimir 'El valor ingresado es incorrecto.'.

package Clase10;

import java.util.Scanner;

public class Ejercicio3_Clase10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        var calificacion = Integer.parseInt(entrada.nextLine());
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("La calificación es \'" + "A" + "\'");
        }
        else if(calificacion >= 8 && calificacion <= 9){
            System.out.println("La calificación es \'" + "B" + "\'");
        }
        else if(calificacion >= 7 && calificacion <= 8){
            System.out.println("La calificación es \'" + "C" + "\'");
        }
        else if(calificacion >= 6 && calificacion <= 7){
            System.out.println("La calificación es \'" + "D" + "\'");
        }
        else if(calificacion >= 0 && calificacion <= 6){
            System.out.println("La calificación es \'" + "F" + "\'");
        }
        else{
            System.out.println("El valor ingresado es incorrecto.");
        }
    }
}
