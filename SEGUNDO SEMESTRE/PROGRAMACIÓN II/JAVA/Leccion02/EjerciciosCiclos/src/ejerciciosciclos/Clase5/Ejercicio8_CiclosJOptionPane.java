/*
Ejercicio 8: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir un número 'N', y mostrar todos los números del 1 al 'N'.
*/

package ejerciciosciclos.Clase5;
import javax.swing.JOptionPane;

public class Ejercicio8_CiclosJOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(input);
        
        System.out.println("Ingrese un número: ");
        
        if(numero<=0){
            System.out.println("No se admiten números negativos o el número cero (0).");
        }
        else{
           System.out.println("Los números del 1 al " + numero + " son: ");
            for(int i = 1; i <= numero; i++){
                System.out.println(i);
            } 
        }
        
        JOptionPane.showMessageDialog(null,"Ejecución Finalizada.");
    }
}
