
package dominio;

public class Persona {
    // Atributos con modificador de acceso tipo 'private'
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
    
}
