/* Java Beans
Para considerar a una clase Java Beans, se deben cumplir ciertas características
por ej, debe tener un constructor vacío y cada atributo dentro de la clase debe 
ser private. Además, cada uno de estos atributos debe tener su método getter y 
setter asociado utilizando el encapsulamiento.

A su vez, precisa de un interface (Serializable), el cual permite enviar la 
clase a diferentes equipos. Igualmente cuenta con más usos, pero al agregar
'implements serializable' cualquier característica extra será agregada por los 
servidores de Java automáticamente.
*/

package domain;

import java.io.Serializable;

public class Persona implements Serializable{
    // La clase tendrá solo dos atributos private -> Puede tener más
    private String nombre;
    private String apellido;
    
    // Constructor Vacío Obligatorio
    public Persona(){
        
    }
    
    // Constructor con Parámetros -> No es requerido
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
        
    // Métodos Getter y Setter con Encapsulamiento -> Si son requeridos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // Complementos -> No son requeridos
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + '}';
    }
    
}
