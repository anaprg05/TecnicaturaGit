/*
Ejercicio 11: Ciclos - Clase JOptionPane
    Diseñar un programa que muestre el producto de los 10 
    primeros números impares.
*/

package ejerciciosciclos.Clase7;
import javax.swing.JOptionPane;

public class Ejercicio11_CiclosJOptionPane {
    public static void main(String[] args) {
        int producto = 1;
        
        for (int i = 1; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número " + i + ":");
            int numero = Integer.parseInt(input);
            
            if(numero % 2 != 0){
                producto *= numero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los números impares es: " + producto);
    }
}
