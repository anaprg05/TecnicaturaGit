// Ejercicio 5 - Clase 9:
//  Hacer un programa que calcule e imprima la suma de tres calificaciones.

package Clase9;

import java.util.Scanner;

public class Ejercicio5_Clase9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la primera calificación: ");
        double calificacion1 = entrada.nextDouble();
        System.out.print("Ingresa la segunda calificación: ");
        double calificacion2 = entrada.nextDouble();
        System.out.print("Ingresa la tercera calificación: ");
        double calificacion3 = entrada.nextDouble();
        double suma = calificacion1 + calificacion2 + calificacion3;

        System.out.println("La suma de las tres calificaciones es: " + suma);
    }
}
