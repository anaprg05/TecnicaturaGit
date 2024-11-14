
package domain;

// Final - Clases
//public final class Persona {
public class Persona {
    // Final - Constantes
    public final static int CONSTANTE_AQUI =15;
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Final - Métodos
    // public final void imprimir(){
    public void imprimir(){
        System.out.println("Método para imprimir.");
    }
}
