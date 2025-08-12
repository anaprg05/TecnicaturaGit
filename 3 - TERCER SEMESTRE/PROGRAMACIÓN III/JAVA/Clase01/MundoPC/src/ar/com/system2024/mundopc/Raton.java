// Clase Hija - Raton
package ar.com.system2024.mundopc;

public class Raton extends DispositivoEntrada{
    // Atributos
    private final int idRaton;
    private static int contadorRatones;
    
    // Constructor
    public Raton(String tipoEntrada, String marca){
        // Llamada a la clase padre
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    // toString
    @Override
    public String toString() {
        return "Raton{" + "idRaton = " + this.idRaton + ", " + super.toString() + '}';
    }
}
