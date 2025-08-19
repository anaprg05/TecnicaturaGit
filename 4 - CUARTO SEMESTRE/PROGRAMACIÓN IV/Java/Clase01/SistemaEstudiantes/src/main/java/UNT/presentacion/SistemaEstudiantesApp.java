package UNT.presentacion;

import UNT.datos.EstudianteDAO;
import UNT.dominio.Estudiante;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        var estudianteDao = new EstudianteDAO();
        while (!salir) {
            try {
                mostrarMenu(); // Se muestra el menú
                salir = ejecutarOpciones(consola, estudianteDao);
            } catch (Exception e){
                System.out.println("Ocurrió un error al ejecutar la operación: " + e.getMessage());
            } // Fin Catch
        } // Fin While
    } // Fin Main

    // Método mostrarMenu
    private static void mostrarMenu(){
        System.out.println("""
                ***** Sistema de Estudiantes *****
                1. Listar estudiantes.
                2. Buscar estudiante.
                3. Agregar estudiante.
                4. Modificar estudiante.
                5. Eliminar estudiante.
                6. Salir.
                
                > Elige una opción:
                """);
    }

    // Método ejecutarOpciones
    private static void ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDao){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 -> {
                System.out.println("Listado de Estudiantes");
                var estudiantes = estudianteDao.listarEstudiantes();
                estudiantes.forEach(System.out::println);
            }

            case 2 -> {
                System.out.println("Introducir ID del estudiante que desea buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDao.buscarEstudiantePorId(estudiante);
                if(encontrado)
                    System.out.println("Estudiante encontrado: " + estudiante);
                else
                    System.out.println("Estudiante NO encontrado: " + estudiante);
            }

            case 3 -> {
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();

                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDao.agregarEstudiante(estudiante);
                if(agregado)
                    System.out.println("Estudiante agregado: " + estudiante);
                else
                    System.out.println("Estudiante NO agregado: " + estudiante);
            }

            case 4 -> {
                System.out.println("Modificar estudiante: ");
                System.out.println("ID del estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();

                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDao.modificarEstudiante(estudiante);
                if(modificado)
                    System.out.println("Estudiante modificado: " + estudiante);
                else
                    System.out.println("Estudiante NO modificado: " + estudiante);
            }

            case 5 -> {
                System.out.println("Eliminar estudiante: ");
                System.out.println("ID del estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());

                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDao.eliminarEstudiante(estudiante);
                if (eliminado)
                    System.out.println("Estudiante eliminado: " + estudiante);
                else
                    System.out.println("Estudiante NO eliminado: " + estudiante);
            }

            case 6 -> {
                System.out.println("Saliendo...");
                salir = true;
            }

            default -> System.out.println("No se reconoce la opción " + opcion + ", seleccione otra opción dentro del Menú.");

        } // Fin Switch
        return salir;
    } // Fin Método ejecutarOpciones
}
