package test;

public class TestArgumentosVariables {
    // Método Main
    public static void main(String[] args) {
        // Llamado del Método imprimirNumeros.
        // Si se llama varias veces, los números se concatenan.
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        
        // Llamado del Método variosParametros.
        variosParametros("César", "Cerbino", 7, 8, 9);
        variosParametros("Illa", "Ríos", 6, 23, 0);
    }
    
    // Método variosParametros
    // El argumento variable SIEMPRE se pone AL FINAL.
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
        imprimirNumeros(numeros);
    }
    
    // Método imprimirNumeros
    // Los argumentos int ...numeros indican que se van a convertir en un arreglo
    // de tipo entero. Los tres puntitos indican que son argumentos variables y 
    // que la cantidad de elementos para este arreglo va a ser indefinido.
    // Los elementos serán definidos a la hora de ejecutar el código.
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
