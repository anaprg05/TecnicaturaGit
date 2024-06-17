// Ejercicio 1 - Clase 10: Cálculo de las estaciones del año con if else
//  Pedirle al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, 
//  luego hay que indicarle en qué estación del año está:
//     VERANO             OTOÑO           INVIERNO        PRIMAVERA
//  21/12 al 21/03    21/03 al 21/06  21/06 al 21/09    21/09 al 21/12
//     1, 2, 3            4, 5, 6          7, 8, 9         10, 11, 12

package Clase10;

import java.util.Scanner;

public class Ejercicio1_Clase10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        
        if(mes == 1 || mes == 2 || mes == 3){
            System.out.println("El mes " + mes + " está en la estación VERANO.");
        }
        else if(mes == 4 || mes == 5 || mes == 6){
            System.out.println("El mes " + mes + " está en la estación OTOÑO.");
        }
        else if(mes == 7 || mes == 8 || mes == 9){
            System.out.println("El mes " + mes + " está en la estación INVIERNO.");
        }
        else if(mes == 10 || mes == 11 || mes == 12){
            System.out.println("El mes " + mes + " está en la estación PRIMAVERA.");
        }
        else{
            System.out.println("Número de mes inexistente, ingrese un número de un mes del año (1-12).");
        }
    }
}
