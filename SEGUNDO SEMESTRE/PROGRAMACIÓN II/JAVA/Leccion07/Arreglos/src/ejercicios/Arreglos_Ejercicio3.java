/*
Ejercicio 3 - Scanner
    Leer 5 números por teclado, almacenarlos en un arreglo y, a continuación,
    realizar la media de los números positivos, la media de los negativos y
    contar el número de ceros.
*/

package ejercicios;

import java.util.Scanner;

public class Arreglos_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creación del arreglo y declaración de variables
        float numeros[] = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteo0 = 0, conteoNegativos = 0, conteoPositivos = 0;
        
        // Entrada de números y guardado dentro del arreglo
        System.out.println("Ingrese 5 números para el arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Índice [" + (i) + "]: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) {
                positivos += numeros[i];
                conteoPositivos ++;
            }
            else if (numeros[i] < 0){
                negativos += numeros[i];
                conteoNegativos ++;
            }
            else{
                conteo0 ++;
            }
        }
        
        if (conteoPositivos == 0){
            System.out.println("\n No se puede sacar la media de los números positivos.");
        }
        else{
            mediaPositivos = positivos/conteoPositivos;
            System.out.println("\n La media de los números positivos es: " + mediaPositivos);
        }
        
        if (conteoNegativos == 0){
            System.out.println("\n No se puede sacar la media de los números negativos.");
        }
        else{
            mediaNegativos = negativos/conteoNegativos;
            System.out.println("\n La media de los números negativos es: " + mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es: " + conteo0);
    }
}
