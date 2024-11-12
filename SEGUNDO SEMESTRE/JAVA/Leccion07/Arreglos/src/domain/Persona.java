
package domain;

public class Persona {
    // Arreglos con tipo Object -> Arreglos con referencia a objetos
    
    // Creación de atributo
    private String nombre; 
    
    // Constructor
    public Persona (String nombre){
        this.nombre = nombre;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + '}' + ", " + super.toString();
    }
}
