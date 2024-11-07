
package domain;

public class Persona {
    // Atributos 
    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    
    // Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        
        // Incremento del contador por cada objeto nuevo
        // No hay que utilizar el operador this
        Persona.contadorPersona++;
        
        // Asignación de un nuevo valor para la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }
    
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // La notación Override agrega información extra al método
    @Override
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + ", nombre = " + nombre + '}';
    }
}
