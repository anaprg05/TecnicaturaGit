
package dominio;

public class Persona {
    // Atributos con modificador de acceso tipo 'private'
    // Si se borra el modificador 'private' pasará a ser 'default' o 'package'
    // Si se escribe la palabra 'default' o 'package' saltará error, no hay que
    // escribirla porque se hace de manera interna.
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    // Constructor tipo public
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    // Declaración de Métodos Getter y Setter
    // Método Get
    public String getNombre(){
        return nombre;
    }
    
    // Método Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    // Método Get
    public double getSueldo(){
        return sueldo;
    }
    
    // Método Set
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    // Método Get -> Utiliza el 'is' debido a que es una pregunta
    public boolean isEliminado(){
        return eliminado;
    }
    
    // Método Set
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    // toString
    // Convierte en una cadena cada atributo
    public String toString(){
        return "Persona [ nombre: " + this.nombre +
                ", sueldo: $" + this.sueldo +
                ", eliminado: " + this.eliminado + " ]";
    }
}
