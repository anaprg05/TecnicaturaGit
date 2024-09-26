/*
Ejercicio 3: Ciclos - Clase Scanner y Clase JOptionPane
    Leer números hasta que se introduzca un cero.
    Para cada uno indicar si es par o impar.
*/

package ejerciciosciclos.Clase3;
import javax.swing.JOptionPane;

public class Ejercicio3_CiclosJOptionPane {
    public static void main(String[] args) {
        int numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            
            if(numero%2 == 0){
                System.out.println("El número "+ numero +" es: PAR");
            }
            else if(numero%2 != 0){
                System.out.println("El número "+ numero +" es: IMPAR");
            }
        } while(numero != 0);
        System.out.println("Ingreso de número cero (0), programa terminado.");
    }
}
