/*
Ejercicio 7: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir números hasta que se introduzca uno negativo y calcular 
    la media.
*/

package ejerciciosciclos.Clase4;
import javax.swing.JOptionPane;

public class Ejercicio7_CiclosJOptionPane {
    public static void main(String[] args) {
        int numero;
        int conteo = 0;
        int suma = 0;
        float promedio;
        
        do {
            String input = JOptionPane.showInputDialog("Introduzca un número (La ejecución acaba con un número negativo):");
            numero = Integer.parseInt(input);
            
            if (numero > 0) {  
                suma += numero;
                conteo++;
            }
        } while (numero > 0);  

        if (conteo > 0) {
            promedio = (float) suma / conteo;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        }
        else if(conteo == 0){  
            System.out.println("Error: No se puede calcular el promedio porque no se ingresaron números válidos.");
        }
    }
}
