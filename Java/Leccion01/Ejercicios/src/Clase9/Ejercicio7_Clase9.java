// Ejercicio 7 - Clase 9:
//  Una compañía de venta de carros usados, 
//  paga a su personal de ventas un salario de $1.000 mensuales más una comisión de $150 por cada carro vendido, 
//  más el 5% del valor de la venta por carro. 
//  Cada mes, el capturista de la empresa ingresa en la computadora los datos pertinentes.
//  Hacer un programa que calcule e imprima el salario mensual del vendedor dado.
//  El salario de $1.000 se va a manejar como un dato constante, 
//  para asignarlo se debe utilizar la palabra reservada “final”.

package Clase9;

import java.util.Scanner;

public class Ejercicio7_Clase9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double SALARIO_BASE = 1000.0;
        System.out.print("Ingresa el número de carros vendidos: ");
        int carrosVendidos = entrada.nextInt();
        System.out.print("Ingresa el valor de venta por carro: ");
        double valorPrecioPorCarro = entrada.nextDouble();
        
        double comisionCarrosVendidos = 150.0 * carrosVendidos;
        double comisionValorVenta = 0.05 * valorPrecioPorCarro * carrosVendidos;
        double salarioMensual = SALARIO_BASE + comisionCarrosVendidos + comisionValorVenta;
        System.out.println("El salario mensual del vendedor es: $" + salarioMensual);
    }
}
