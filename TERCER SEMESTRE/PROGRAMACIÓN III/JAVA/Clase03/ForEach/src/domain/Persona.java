
package domain;

public class Persona {
    // Atributo
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // toString
    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + nombre + '}';
    }
    
}
