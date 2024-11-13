
package test;

public class TestMatrices {
    public static void main(String[] args) {
        // Una matriz es un arreglo de arreglos, conformado por filas y columnas
        // Sintáxis -> Filas y coplumnas
        
        // En este caso, la matriz edades cuenta con tres filas y dos columnas
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        // Llenado manual
        edades[0][0] = 5;
        // Misma fila, columna distinta
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][1] = " + edades[0][1]);
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("edades[1][1] = " + edades[1][1]);
        
        /*
        TAREA:
            Agregar valores para los dos índices faltantes e imprimirlos
        */
        
        edades[2][0] = 1;
        edades[2][1] = 10;
        
        System.out.println("edades[2][0] = " + edades[2][0]);
        System.out.println("edades[2][1] = " + edades[2][1]);
        
    }
}
