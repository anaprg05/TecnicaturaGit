// Ejercicio 4 - Clase 10: Sistema de calificaciones con switch
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

public class Ejercicio4_Clase10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        var calificacion = Integer.parseInt(entrada.nextLine());
        switch(calificacion){
            case 10: case 9:
                System.out.println("La calificación es \'" + "A" + "\'");
                break;
            case 8:
                System.out.println("La calificación es \'" + "B" + "\'");
                break;
            case 7:
                System.out.println("La calificación es \'" + "C" + "\'");
                break;
            case 6:
                System.out.println("La calificación es \'" + "D" + "\'");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("La calificación es \'" + "F" + "\'");
                break;
            default:
                System.out.println("El valor ingresado es incorrecto.");
        }
    }
}
