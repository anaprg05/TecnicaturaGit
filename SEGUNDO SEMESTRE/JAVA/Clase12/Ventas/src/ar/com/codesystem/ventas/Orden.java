
package ar.com.codesystem.ventas;

public class Orden {
    // Atributos de la clase
    private int idOrden;
    // Declaración del arreglo
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    // Declaración de la constante
    private static final int MAX_PRODUCTOS = 10;
    
    // Constructor vacío
    public Orden(){
        this.idOrden = ++ Orden.contadorOrdenes;
        // Declaración de límites de productos
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    // Método que combina la clase Orden y la clase Objeto
    public void agregarProducto(Producto producto){
        // Condicional para comprobaciones
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
}
