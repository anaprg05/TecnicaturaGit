// Clase Monitor
package ar.com.system2024.mundopc;

public class Monitor {
    // Atributos
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    // Constructor vacío
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    // Constructor
    public Monitor(String marca, double tamanio){
        // Llamado al constructor vacío
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    // Métodos Getter y Setter
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    // Ingreso manual de getIdMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    // toString
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
}
