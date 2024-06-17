// Ejercicio 1 - Clase 10: Cálculo de las estaciones del año con switch
//  Pedirle al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, 
//  luego hay que indicarle en qué estación del año está:
//     VERANO             OTOÑO           INVIERNO        PRIMAVERA
//  21/12 al 21/03    21/03 al 21/06  21/06 al 21/09    21/09 al 21/12
//     1, 2, 3            4, 5, 6          7, 8, 9         10, 11, 12

package Clase10;

import java.util.Scanner;

public class Ejercicio2_Clase10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estación = ("Estación desconocida.");
        
        switch(mes){
            case 1: case 2: case 3:
                System.out.println("El mes " + mes + " está en la estación VERANO.");
                break;
            case 4: case 5: case 6:
                System.out.println("El mes " + mes + " está en la estación OTOÑO.");
                break;
            case 7: case 8: case 9: 
                System.out.println("El mes " + mes + " está en la estación INVIERNO.");
                break;
            case 10: case 11: case 12:
                System.out.println("El mes " + mes + " está en la estación PRIMAVERA.");
                break;
            default:
                System.out.println("Número de mes inexistente, ingrese un número de un mes del año (1-12).");
        }
    }
}
