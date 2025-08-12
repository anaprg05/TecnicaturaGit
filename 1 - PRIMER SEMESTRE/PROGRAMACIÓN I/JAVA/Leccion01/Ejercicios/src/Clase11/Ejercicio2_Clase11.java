// Ejercicio 2 - Clase 11: Almacén
//  En un almacén se hace un 20 MOD de descuento a los clientes cuya compra
//  supere los $100, ¿cuál será la cantidad que pagará una persona por su compra?

package Clase11;

import java.util.Scanner;

public class Ejercicio2_Clase11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad a pagar: ");
        double compra = Double.parseDouble(entrada.nextLine());
        
        if(compra>100){
            double descuento = compra*0.2;
            double precioFinal = compra - descuento;
            System.out.println("El precio a pagar con el descuento es de: $" + precioFinal);
        }
        else{
            System.out.println("La compra no tiene descuento.");
        }
    }   
}
