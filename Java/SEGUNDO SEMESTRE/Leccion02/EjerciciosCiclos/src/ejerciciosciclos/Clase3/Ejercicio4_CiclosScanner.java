/*
Ejercicio 4: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir números hasta que se ingrese un número negativo y mostrar cuántos números
    se han introducido.
*/

package ejerciciosciclos.Clase3;
import java.util.Scanner;

public class Ejercicio4_CiclosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;
        
        do{
            System.out.println("Ingresar números (La secuencia se acabará cuando se ingrese un número negativo): ");
            numero = scanner.nextInt();
            
            if(contador >= 0){
                contador ++;
            }
        }while(numero >= 0);
        
        System.out.println("Ingreso de número negativo, ciclo terminado.");
        System.out.println("La cantidad de números ingresados son: " + contador);
    }
}
