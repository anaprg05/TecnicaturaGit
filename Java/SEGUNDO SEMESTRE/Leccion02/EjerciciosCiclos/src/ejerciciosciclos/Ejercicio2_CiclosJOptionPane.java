/*
Ejercicio 2: Ciclos - Clase Scanner y Clase JOptionPane
    Leer un número e indicar si es positivo o negativo. El proceso
    se repetirá hasta que se introduza el número cero (0).
*/

package ejerciciosciclos;
import javax.swing.JOptionPane;

public class Ejercicio2_CiclosJOptionPane {
    public static void main(String[] args) {
        int numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            
            if(numero > 0){
                System.out.println("El número "+ numero +" es: POSITIVO");
            }
            else if(numero < 0){
                System.out.println("El número "+ numero +" es: NEGATIVO");
            }
        } while(numero != 0);
        System.out.println("Ingreso de número cero (0), programa terminado.");
    }
}
