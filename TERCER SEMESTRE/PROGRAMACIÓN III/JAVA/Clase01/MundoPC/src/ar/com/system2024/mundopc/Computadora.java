// Clase Computadora
package ar.com.system2024.mundopc;

public class Computadora {
    // Atributos
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    // Constructor vacío
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    // Constructor
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton ratons){
        // Llamado al constructor vacío
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    
    // Ingreso manual de getIdComputadora
    public int getIdComputadora(){
        return this.idComputadora;
    }
    
    // Métodos Getter y Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    // toString
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora = " + idComputadora + ", nombre = " + nombre + ", monitor = " + monitor + ", teclado = " + teclado + ", raton = " + raton + '}';
    }
}
