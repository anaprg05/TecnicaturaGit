/*
Ejercicio 12: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir un número y calcular su factorial.
*/

package ejerciciosciclos.Clase7;
import javax.swing.JOptionPane;

public class Ejercicio12_CiclosJOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese el número:");
        int numero = Integer.parseInt(input);
        int factorial = 1;
        
        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}
