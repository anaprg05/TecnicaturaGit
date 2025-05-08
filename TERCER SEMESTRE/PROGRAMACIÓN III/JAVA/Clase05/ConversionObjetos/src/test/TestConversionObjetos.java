
package test;

// Importación de clases
import domain.*;

public class TestConversionObjetos {
    // Método Main
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Ana", 5000, TipoEscritura.CLASICO);
        System.out.println("Empleado: " + empleado);
        // Acceso a los Métodos de la Clase Escritor
        System.out.println(empleado.obtenerDetalles());
        
        // Downcasting
        // Opción 1
        // ((Escritor)empleado).getTipoEscritura();
        // Opción 2
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();
        
        // Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
