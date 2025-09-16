package utn.estudiantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utn.estudiantes.modelo.Estudiantes2024;
import utn.estudiantes.servicio.EstudianteServicio;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

    @Autowired
    private EstudianteServicio estudianteServicio;

    private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

    String nl = System.lineSeparator();

    public static void main(String[] args) {
        logger.info("Iniciando la aplicación...");
        SpringApplication.run(EstudiantesApplication.class, args);
        logger.info("Aplicación finalizada correctamente");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("▶ Ejecutando el método run de Spring...");
        var salir = false;
        var consola = new Scanner(System.in);
        while (!salir) {
            mostrarMenu();
            salir = ejecutarOpciones(consola);
            logger.info(nl);
        } // Fin ciclo While
    }

    private void mostrarMenu() {
        // logger.info(nl);
        logger.info("""
                ------- Sistema de Estudiantes -------
                1. Listar Estudiantes
                2. Buscar Estudiante
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                Elija una opción:""");
    }

    private boolean ejecutarOpciones(Scanner consola) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            // Listar Estudiantes
            case 1 -> {
                logger.info(nl + "Listado de Estudiantes:" + nl);
                List<Estudiantes2024> estudiantes = estudianteServicio.listarEstudiantes();
                estudiantes.forEach((estudiante) -> logger.info(estudiante.toString() +nl));
            }
            // Buscar Estudiante
            case 2 -> {
                logger.info(nl + "Digite el ID del estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                Estudiantes2024 estudiante =
                        estudianteServicio.buscarEstudiantePorId(idEstudiante);
                if (estudiante != null)
                    logger.info("Estudiante encontrado: " + estudiante + nl);
                else
                    logger.info("Estudiante NO encontrado: " + estudiante + nl);
            }
            // Agregar Estudiante
            case 3 -> {
                logger.info("Agregar estudiante: " + nl);
                logger.info("Nombre del estudiante: ");
                var nombre = consola.nextLine();
                logger.info("Apellido del estudiante: ");
                var apellido = consola.nextLine();
                logger.info("Telefono del estudiante: ");
                var telefono = consola.nextLine();
                logger.info("Email del estudiante: ");
                var email = consola.nextLine();

                // Creación objeto estudiante sin el ID
                var estudiante = new Estudiantes2024();
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
                estudiante.setTelefono(telefono);
                estudiante.setEmail(email);
                estudianteServicio.guardarEstudiante(estudiante);
                logger.info("Estudiante agregado: " + estudiante + nl);
            }
            // Modificar Estudiante
            case 4 -> {
                logger.info("Modificar estudiante: " + nl);
                logger.info("Ingrese el ID del estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                // Búsqueda del estudiante a modificar
                Estudiantes2024 estudiante =
                        estudianteServicio.buscarEstudiantePorId(idEstudiante);
                if(estudiante != null) {
                    logger.info("Nombre: ");
                    var nombre = consola.nextLine();
                    logger.info("Apellido: ");
                    var apellido = consola.nextLine();
                    logger.info("Telefono: ");
                    var telefono = consola.nextLine();
                    logger.info("Email: ");
                    var email = consola.nextLine();
                    estudiante.setNombre(nombre);
                    estudiante.setApellido(apellido);
                    estudiante.setTelefono(telefono);
                    estudiante.setEmail(email);
                    estudianteServicio.guardarEstudiante(estudiante);
                    logger.info("Estudiante modificado: " + estudiante + nl);
                }
                else
                    logger.info("Estudiante NO encontrado con el ID: " + idEstudiante + nl);
            }
            // Eliminar Estudiante
            case 5 -> {
                logger.info("Eliminar estudiante: " + nl);
                logger.info("Eliminar estudiante: " + nl);
                logger.info("Digite el ID del estudiante: " + nl);
                var idEstudiante = Integer.parseInt(consola.nextLine());
                // Búsqueda del ID del estudiante a eliminar
                var estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
                if(estudiante != null) {
                    estudianteServicio.eliminarEstudiante(estudiante);
                    logger.info("Estudiante eliminado: " + estudiante + nl);
                }
                else
                    logger.info("Estudiante NO encontrado con ID: " + idEstudiante + nl);
            }
            // Salir del Menú
            case 6 -> {
                logger.info("¡Hasta pronto!");
                salir = true;
            }
            default -> logger.info("Opción no reconocida, pruebe con otra." + nl);
        } // Fin Switch
        return salir;
    }
}
