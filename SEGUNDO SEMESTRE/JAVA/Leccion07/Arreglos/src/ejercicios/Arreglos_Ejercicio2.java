/*
Ejercicio 2 - Scanner
    Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso 
    al introducido.
 */

package ejercicios;

import java.util.Scanner;

public class Arreglos_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creación del arreglo
        float numeros[] = new float[5];
        
        // Entrada de números y guardado dentro del arreglo
        System.out.println("Ingrese 5 números para el arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Índice [" + (i) + "]: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Impresión de arreglo de números ordenados de forma inversa
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Arreglo numeros y sus elementos [" + i + "]: " + numeros[i]);
        }
    }
}
