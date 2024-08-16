// Ejercicio 6 - Clase 9:
//  Guillermo tiene ‘N’ dólares. 
//  Luis tiene la mitad de lo que posee Guillermo. 
//  Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
//  Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

package Clase9;

import java.util.Scanner;

public class Ejercicio6_Clase9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo: ");
        double dineroG = entrada.nextDouble();
        
        double dineroL = dineroG / 2;
        double dineroJ = (dineroG + dineroL)/2;
        
        double dineroTotal = dineroG + dineroL + dineroJ;
        
        System.out.println("Guillermo tiene $" + dineroG);
        System.out.println("Luis tiene $" + dineroL);
        System.out.println("Juan tiene $" + dineroJ);
        System.out.println("Entre los tres tienen $" + dineroTotal);
    }
}
