import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    // Metodo Main
    public static void main(String[] args) {
        // Objeto de entrada de información
        Scanner entrada = new Scanner(System.in);
        // Definición de Lista fuera del Ciclo While
        List<Persona> personas = new ArrayList<>();

        // Menú
        var salir = false;
        // Mientras el valor de salir no sea diferente, el ciclo se ejecutará
        while(!salir){
            // Llamado a metodo mostrarMenu
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println();
        } // Fin Ciclo While
    } // Fin Metodo Main

    // Metodo mostrarMenu
    private static void mostrarMenu(){
        // Opciones
        System.out.print("""
                >>>>>>>>> Listado de Personas <<<<<<<<
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Ingrese una de las opciones: ");
    } // Fin Metodo mostrarMenu

    // Metodo ejecutarOperacion
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        // Revision de la opcion ingresada a traves de un Switch
        switch (opcion){
            // Agregar una persona a la lista
            case 1 -> {
                System.out.print("Ingrese el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Ingrese el teléfono: ");
                var tel = entrada.nextLine();
                System.out.print("Ingrese el correo: ");
                var email = entrada.nextLine();
                // Objeto persona
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos.");
            } // Fin del caso 1

            // Listar a las personas
            case 2 -> {
                System.out.println("Listado de personas: ");
                // Mejoras con lambda y metodo de referencia
                // personas.forEach((persona) -> System.out.println(persona));
                // Mejora simplificada con el metodo de referencia (::)
                personas.forEach(System.out::println);
            } // Fin del caso 2

            // Salir del ciclo
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir =true;
            } // Fin del caso 3
            default -> System.out.println("Opción incorrecta: " + opcion);
        } // Fin del Switch
        return salir;
    }// Fin Metodo ejecutarOperacion
} // Fin Clase ListadoPersonasApp