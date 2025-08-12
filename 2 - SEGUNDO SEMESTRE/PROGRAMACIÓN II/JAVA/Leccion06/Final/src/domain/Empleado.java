
package domain;

// Si se intenta hacer una herencia entre empleado y persona, saltará error 
// debido a que la clase persona contiene la palabra final
public class Empleado extends Persona {
    // No dejará sobreescribir el método por la palabra final
    public void imprimir(){
        System.out.println("Método para imprimir desde la clase hija.");
    }
}
