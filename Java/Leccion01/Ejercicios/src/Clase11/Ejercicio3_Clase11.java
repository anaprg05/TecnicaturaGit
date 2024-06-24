// Ejercicio 3 - Clase 11: Números
//  Leer 2 números, si son iguales, que los multiplique; si el primero es mayor
//  que el segundo, que los reste y si no, que los sume.

package Clase11;

import java.util.Scanner;

public class Ejercicio3_Clase11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese un segundo número: ");
        var num2 = Integer.parseInt(entrada.nextLine());
        
        if (num1 == num2){
            var resultado = num1*num2;
            System.out.println("Al ser iguales, se multiplican. El resultado es: " + resultado);
        }
        else if (num1>num2){
            var resultado = num1 - num2;
            System.out.println("Al ser el primero mayor al segundo, se restan. El resultado es: " + resultado);
        }
        else {
            var resultado = num1 + num2;
            System.out.println("Al ser el segundo mayor al primero, se suman. El resultado es: " + resultado);
        }
    }
}
