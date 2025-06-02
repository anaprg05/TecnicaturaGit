package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        // Bloque Try Catch
        try{
        resultado = division(10, 0);
        } catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion.");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Ocurrió un Error.");
        // e.printStackTrace(System.out); -> manda a imprimir a consola, 
        //                      aunque no es requerido.
            e.printStackTrace(System.out); // -> Pila de excepciones
            System.out.println(e.getMessage());
        }
        
        // Por más que el programa ande sin problemas, el finally se ejecutará.
        finally{
            System.out.println("Se revisó la división entre cero.");
        }
        
        System.out.println("La variable resultado tiene como valor: " + resultado);
    }
}
