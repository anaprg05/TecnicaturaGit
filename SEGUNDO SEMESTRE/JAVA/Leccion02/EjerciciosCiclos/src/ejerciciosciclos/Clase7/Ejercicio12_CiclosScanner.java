/*
Ejercicio 12: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir un número y calcular su factorial.
*/

package ejerciciosciclos.Clase7;
import java.util.Scanner;

public class Ejercicio12_CiclosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        int factorial = 1;
        
        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }
        
        System.out.println("El factorial del número " + numero + " es: " + factorial);
    }
}
