/*
Ejercicio 6: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir números hasta que se teclee un cero (0), mostrar la suma de todos los 
    números introducidos.
*/

package ejerciciosciclos.Clase4;
import javax.swing.JOptionPane;

public class Ejercicio6_CiclosJOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        
        
        do{
            String input = JOptionPane.showInputDialog("Ingrese un número (El 0 finaliza el programa):");
            numero = Integer.parseInt(input);
            suma += numero;
            
        }while(numero != 0);
        System.out.println("Se ingresó el número cero (0) - Programa finalizado.");
        JOptionPane.showMessageDialog(null, "La suma de todos los números es: " + suma);
    }
}
