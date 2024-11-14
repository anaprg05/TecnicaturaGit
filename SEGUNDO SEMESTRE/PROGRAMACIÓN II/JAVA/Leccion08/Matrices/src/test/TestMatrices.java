
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
        
        System.out.println("\n-Recorrido de la matriz a través del ciclo for-");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades [" + fila + "][" + col + "]: " + edades[fila][col]);
            }
        }
        
        System.out.println("\n-Sintaxis simplificada-");
        
        // Sintaxis clásica
        // String frutas[][] = new String[3][2];
        
        // Sintaxis simplificada de matrices
        String frutas[][] = {{"Limón", "Pomelo"}, {"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++){
                System.out.println("frutas [" + i + "][" + j + "]: " + frutas[i][j]);
            }
        }
    }
}
