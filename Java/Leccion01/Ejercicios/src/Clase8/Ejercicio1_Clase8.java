// Ejercicio 1 - Clase 8: Sacar área y perímetro de un rectángulo
//  Se solicita calcular el área y el perímetro de un rectángulo. 
//  Para ello, es necesario crear las siguientes variables:
//   alto 
//   ancho 
//  El usuario debe proporcionar los valores de alto y ancho, 
//  después se debe imprimir el resultado en el siguiente formato:
//   Proporciona el alto del rectángulo: 
//   Proporciona el ancho del rectángulo: 
//   Área: 
//   Perímetro: 
// FÓRMULAS NECESARIAS
//   Área = Alto * Ancho y Perímetro = (Alto+Ancho)*2

package Clase8;

import java.util.Scanner;

public class Ejercicio1_Clase8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Proporciona el ALTO del rectángulo: ");
        int alto = Integer.parseInt(entrada.nextLine());
        System.out.print("Proporciona el ANCHO del rectángulo: ");
        int ancho = Integer.parseInt(entrada.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
