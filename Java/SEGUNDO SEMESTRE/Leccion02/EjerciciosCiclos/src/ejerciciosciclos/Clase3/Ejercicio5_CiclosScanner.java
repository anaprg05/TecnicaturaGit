/*
Ejercicio 5: Ciclos - Clase Scanner y Clase JOptionPane
    Realizar un juego para adivinar un número, para ello hay que generar un 
    número aleatorio entre 0-100, y luego ir pidiendo números indicando "Es menor"
    o "Es mayor" según sea mayor o menor respecto a 'N'. El proceso termina cuando
    el usuario acierta y se muestra el número de intentos hechos.
*/

package ejerciciosciclos.Clase3;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio5_CiclosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(101); 
        int numero;
        int contador = 0;
        
        System.out.println("Se ha generado un número aleatorio entre 0 y 100.");
        System.out.println("¿Cuál es?");
        
        do{
            numero = scanner.nextInt();
            contador ++;
            
            if(numero > numeroAleatorio){
                System.out.println("El número " + numero + " es MAYOR al número generado.");
            }
            else if(numero < numeroAleatorio){
                System.out.println("El número " + numero + " es MENOR al número generado.");
            }
        }while(numero != numeroAleatorio);
        
        System.out.println("¡Acertaste!");
        System.out.println("El número es: " + numeroAleatorio);
        System.out.println("Cantidad de intentos: " + contador);
    }
}
