// Ejercicio 2 - Clase 8: El mayor de dos números (Operador Ternario)
// Solicitar al usuario dos valores, determinar cuál es el mayor.
// 1. Solicitar al usuario dos valores: 
//   numero1 (int)
//   numero2 (int)
// 2. Se debe imprimir el mayor de los dos números (La salida debe ser idéntica a la siguiente):
//   Ingrese el valor para el número 1:
//   Ingrese el valor para el número 2:
//   El número mayor es: <numeroMayor>.

package Clase8;

import java.util.Scanner;

public class Ejercicio2_Clase8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor para el número 1: ");
        int num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el valor para el número 2: ");
        int num2 = Integer.parseInt(entrada.nextLine());
        
        var resultadoT = (num1 > num2) ? "El número 1 es mayor." : "El número 2 es mayor.";
        System.out.println(resultadoT);
    }
}
