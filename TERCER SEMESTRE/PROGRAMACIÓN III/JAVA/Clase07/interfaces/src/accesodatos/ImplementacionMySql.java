
package accesodatos;

// Para implementar una interface a una clase de Java, se hace uso de la palabra
// reservada 'implements'
public class ImplementacionMySql implements IAccesoDatos {
    // Implementación de los métodos abstractos, esto permite que se añada el 
    // comportamiento de la interface a la clase
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL.");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL.");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL."); 
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL.");
    }
}
