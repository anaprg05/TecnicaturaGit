// Ejercicio 1:
//  Indicar si el usuario es mayor de edad o no.
import java.util.Scanner;


public class Ejercicio2_Clase6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        //Convertimos la entrada del usuario (que es una cadena) a un número entero usando Integer.parseInt().
        int edad = Integer.parseInt(entrada.nextLine()); 
        var adulto = edad >= 18;
        if (adulto){
            System.out.println("Usted es mayor de edad.");
        }
        else{
            System.out.println("Usted es menor de edad.");
        }
    }
}
