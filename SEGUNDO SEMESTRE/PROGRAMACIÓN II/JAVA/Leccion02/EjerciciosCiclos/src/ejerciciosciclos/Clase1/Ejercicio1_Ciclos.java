/* 
Ejercicio 1: Ciclos - Clase Scanner
    Leer un número y mostrar su cuadrado, repetir el proceso
    hasta que se introduzca un número negativo.
*/

package ejerciciosciclos.Clase1;
import java.util.Scanner;

public class Ejercicio1_Ciclos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(entrada.nextLine());
            
            if(numero >= 0){
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            }
        }while (numero > 0);
        System.out.println("Ingreso de número negativo, programa terminado.");
    }
}
