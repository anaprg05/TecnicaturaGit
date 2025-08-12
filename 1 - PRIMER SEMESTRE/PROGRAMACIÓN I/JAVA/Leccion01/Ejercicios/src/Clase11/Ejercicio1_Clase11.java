// Ejercicio 1 - Clase 11: Notas de Curso Con Estructura if else
//  Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobará
//  si su promedio de tres calificaciones es mayor o igual a 70. En caso contrario,
//  reprueba.

package Clase11;

import java.util.Scanner;

public class Ejercicio1_Clase11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primer calificación:");
        var nota1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese la segunda calificación:");
        var nota2 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese la tercer calificación:");
        var nota3 = Integer.parseInt(entrada.nextLine());
        
        var notaPromedio = (nota1 + nota2 + nota3)/3;
        System.out.println("El promedio de las tres notas es de: " + notaPromedio);
        
        if (notaPromedio >= 70){
            System.out.println("El alumno está aprobado.");
        }
        else{
            System.out.println("El alumno no está aprobado.");
        }
    }
}
