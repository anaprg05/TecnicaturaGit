// Ejercicio 1 - Clase 6: Tienda de Libros
// 1. Mostrar: 'Ingrese los siguientes datos del libro:'
// 2. Ingrese el nombre del libro.
// 3. Ingrese el ID del libro.
// 4. Ingrese el precio del libro.
// 5. Indicar si el envío es gratuito (True/False).
// 6. Mostrar:
//   Nombre:
//   ID: 
//   Precio: 
//   ¿Envío Gratuito?

package Clase6;

import java.util.Scanner;

public class Ejercicio1_Clase6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro: ");
        
        System.out.println("Nombre del Libro: ");
        String nombreLibro = entrada.nextLine();
        
        System.out.println("ID del Libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Precio del Libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        
        System.out.println("¿Envío Gratuito? (True/False) ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio del Libro: $" + precioLibro);
        System.out.println("El envío del libro es: " + envioGratuito);
    }
}
