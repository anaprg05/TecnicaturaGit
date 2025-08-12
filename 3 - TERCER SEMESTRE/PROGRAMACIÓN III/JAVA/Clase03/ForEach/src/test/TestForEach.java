/*  ForEach
      Es básicamente un ciclo for mejorado. Simplifica la forma en la que se
    recorrerán los arreglos o colecciones.
*/

package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        // Arreglo con sintáxis resumida.
        // El arreglo debe tener si o si el tipo de variable que manejará.
        // No puede ser 'var'.
        int edades[] = {5, 6, 8, 9};
        
        // Ciclo for original.
        /*
        for (int i = 0; i < edades.length; i++) { 
        }
        */
        
        // Ciclo ForEach
        // La sintáxis es la misma que el ciclo for, solo que no se especifica 
        // un contador. Gracias a eso, no se puede acceder a un índice.
        // La variable siempre corresponde al tipo de arreglo, si es int, si es
        // String, etc.
        for(int edad: edades){
            System.out.println("Edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Lautaro"), new Persona("Nelson"), new Persona("Ana"), new Persona("Paula")};
        
        // Ciclo ForEach
        for(Persona persona: personas){
            System.out.println("Persona = " + persona);
        }
    }
}
