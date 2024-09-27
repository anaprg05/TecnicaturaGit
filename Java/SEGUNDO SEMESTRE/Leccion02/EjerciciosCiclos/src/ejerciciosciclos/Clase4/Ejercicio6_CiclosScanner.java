/*
Ejercicio 6: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir números hasta que se teclee un cero (0), mostrar la suma de todos los 
    números introducidos.
*/

package ejerciciosciclos.Clase4;
import java.util.Scanner;

public class Ejercicio6_CiclosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        
        System.out.println("Ingrese los números que desea sumar (El 0 finaliza el programa): ");
        
        do{
            numero = scanner.nextInt();
            suma += numero;
            
        }while(numero != 0);
        System.out.println("Se ingresó el número cero (0) - Programa finalizado.");
        System.out.println("La suma de todos los números es: "+ suma);
    }
}
