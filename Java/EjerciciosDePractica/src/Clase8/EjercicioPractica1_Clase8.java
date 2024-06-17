// Ejercicio Práctica 2 - Clase 7:
//  Utilizar los operadores ternarios para comprobar si el número es par o impar.
package Clase8;

public class EjercicioPractica1_Clase8 {

    public static void main(String[] args) {
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "El número es par" : "El número es impar.";
        System.out.println("resultadoT = " + resultadoT);
    }
}
