/*
Ejercicio 4: Ciclos - Clase Scanner y Clase JOptionPane
    Pedir números hasta que se ingrese un número negativo y mostrar cuántos números
    se han introducido.
 */
package ejerciciosciclos.Clase3;
import javax.swing.JOptionPane;

public class Ejercicio4_CiclosJOptionPane {

    public static void main(String[] args) {
        int numero;
        int contador = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingresar números (La secuencia se acabará cuando se ingrese un número negativo): "));

            if (contador >= 0) {
                contador++;
            }
        } while (numero >= 0);

        System.out.println("Ingreso de número negativo, ciclo terminado.");
        System.out.println("La cantidad de números ingresados son: " + contador);
    }
}
