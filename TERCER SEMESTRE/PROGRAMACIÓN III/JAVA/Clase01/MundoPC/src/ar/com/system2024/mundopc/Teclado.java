// Clase Hija - Teclado
package ar.com.system2024.mundopc;

public class Teclado extends DispositivoEntrada{
    // Atributos
    private final int idTeclado;
    private static int contadorTeclados;

    // Constructor
    public Teclado(String tipoEntrada, String marca) {
        // Llamada a la clase padre
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    // toString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado = " + idTeclado + ", " + super.toString() + '}';
    }
}
