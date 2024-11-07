
package domain;

public class Persona {
    // Atributos de herencia
    // Para que las clases hijas accedan a los objetos dentro del atributo 
    // encapsulado, no se utiliza 'private', se utiliza 'protected'
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    // CONSTRUCTORES
    // 1. Constructor vacío
    // Se utiliza para crear objetos sin necesidad de inicializar los atributos
    // de la clase
    public Persona(){
        
    }
    
    // 2. Constructor con parámetros (nombre)
    public Persona(String nombre){
        this.nombre = nombre;
    }

    // 3. Constructor con parámetros (todos los atributos)
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Métodos Getter y Setter
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", genero = " + genero + ", edad = " + edad + ", direccion = " + direccion + '}';
    }
}
