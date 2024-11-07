
package test;

import ar.com.codesystem.Utileria;
// Importación estática -> solo aplica para métodos estáticos
// import static ar.com.codesystem.Utileria.imprimir;


public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos a todos los alumnos de la tecnicatura.");
        // imprimir("Terminamos en unos minutos...");
        // Nombre completamente calificado -> No es recomendable
        //ar.com.codesystem.Utileria.imprimir("Ahora si estamos terminando.");
    }
}
