/*
Ejercicio 2: Ciclos - Clase Scanner y Clase JOptionPane
    Leer un número e indicar si es positivo o negativo. El proceso
    se repetirá hasta que se introduza el número cero (0).
*/

package ejerciciosciclos.Clase2;
import java.util.Scanner;

public class Ejercicio2_CiclosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            
            if (numero > 0) {
                System.out.println("El número " + numero + " es: POSITIVO");
            } 
            else if (numero < 0) {
                System.out.println("El número " + numero + " es: NEGATIVO");
            }
        } while (numero != 0);
        
        System.out.println("Ingreso de número cero (0), programa terminado.");
    }
}

