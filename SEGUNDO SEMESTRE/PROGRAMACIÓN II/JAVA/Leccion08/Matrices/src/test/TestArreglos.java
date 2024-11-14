
package test;

public class TestArreglos {
    public static void main(String[] args) {
        // Los índices de los arreglos inician desde el 0, es decir, si se tiene
        // un arreglo de 5 índices, el primer índice es 0 y el último 4
        // La forma de definir los arreglos siempre es en plural
        
        // Lado derecho -> Instancia de un objeto del tipo object
        // Lado izquierdo -> Declaración de variables
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        // Cómo modificar los elementos del arreglo
        edades[0] = 17;
        System.out.println("edades [0] = " + edades[0]);
        edades[1] = 25;
        System.out.println("edades [1] = " + edades[1]);
        edades[2] = 31;
        System.out.println("edades [2] = " + edades[2]);
        
        // ¿Qué pasa cuando se accede a un elemento fuera del arreglo?
        // Al estar fuera de rango, el error no será de copilación, sino de tiempo
        // edades[3] = 7;
        
        // Iteración de todos los elementos
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Arreglo edades y sus elementos" + i + ": " + edades[i]);
        }
    }
}
