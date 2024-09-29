/*
Ejercicio 8: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir un número 'N', y mostrar todos los números del 1 al 'N'.
*/

package ejerciciosciclos.Clase5;
import java.util.Scanner;

public class Ejercicio8_CiclosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingrese un número: ");
        numero = scanner.nextInt();
        
        if(numero<=0){
            System.out.println("No se admiten números negativos o el número cero (0).");
        }
        else{
           System.out.println("Los números del 1 al " + numero + " son: ");
            for(int i = 1; i <= numero; i++){
                System.out.println(i);
            } 
        }
        
        System.out.println("Ejecución finalizada.");
    }
}
