// Ejercicio Práctica 1 - Clase 3:
//  Se solicita incluir la siguiente información acerca de un libro:
//      'Título'
//      'Autor'
//  Debes imprimir la información en el siguiente formato:
//      Proporciona el título:
//      Proporciona el autor:
//  <título> fue escrito por <autor>

package Clase3;

import java.util.Scanner;


public class EjercicioPractica1_Clase3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el título del libro: ");
        var tituloLibro = entrada.nextLine();
        System.out.println("Ingrese el nombre del autor del libro: ");
        var autorLibro = entrada.nextLine();
        System.out.println("El libro \'" + tituloLibro + "\' fue escrito por " + autorLibro);
    }
}
