// Clase Orden
package ar.com.system2024.mundopc;

public class Orden {
    // Atributos
    private final int idOrden;
    // Arreglo de objetos
    private Computadora computadora[];
    private static int contadorComputadoras;
    private static final int MAX_Computadoras = 10;
    private int contadorComputadora;
    
    // Constructor Vacío
    public Orden(){
        this.idOrden = ++Orden.contadorComputadoras;
        this.computadora = new Computadora[Orden.MAX_Computadoras];
    }
            
    // Método para agregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_Computadoras){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else{
            System.out.println("Superaste el límite de computadoras: " + Orden.MAX_Computadoras);
        }
    }
    
    // Mostrar Orden
    public void mostrarOrden(){
        System.out.println("Orden: " + this.idOrden);
        System.out.println("Computadoras de la orden: " + this.idOrden);
        for(int i = 0; i < this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }
}
