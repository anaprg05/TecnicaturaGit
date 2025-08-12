// Ejercicio Práctica 1 - Clase 10:

package Clase10;

public class EjercicioPractica1_Clase10 {
    public static void main(String[] args) {
        var numero = 3;
        var numeroTexto = "Número desconocido.";

        if(numero == 1){
            numeroTexto = "Número uno.";
        }
        else if(numero == 2){
            numeroTexto = "Número dos.";
        }
        else if(numero == 3){
            numeroTexto = "Número tres.";
        }
        else if(numero == 4){
            numeroTexto = "Número cuatro.";
        }
        else{
            numeroTexto = "Número no encontrado.";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
