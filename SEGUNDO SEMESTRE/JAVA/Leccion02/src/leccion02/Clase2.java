/* Ejemplo para aprender a usar la clase JOptionPane
Ejercicio 1: Ciclos - Clase Scanner
        Leer un número y mostrar su cuadrado, repetir el proceso
        hasta que se introduzca un número negativo.
*/

package leccion02;
import javax.swing.JOptionPane;

public class Clase2 {
    public static void main(String[] args) {
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El número "+ numero +" elevado al cuadrado es: " + cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
        }
        System.out.println("El programa ha finalizado por número negativo.");
    }
}
