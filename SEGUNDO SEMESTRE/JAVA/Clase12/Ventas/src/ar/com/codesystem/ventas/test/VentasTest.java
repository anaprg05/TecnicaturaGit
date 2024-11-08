
package ar.com.codesystem.ventas.test;
// Importación de clases
import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        // Creación de objetos
        // Clase Producto
        Producto producto1 = new Producto("Pantalón", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        
        // Clase Orden
        Orden orden1 = new Orden();
        
        // Se agregan productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        orden1.mostrarOrden();
    }
}
