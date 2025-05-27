
package accesodatos;

// Para implementar una interface a una clase de Java, se hace uso de la palabra
// reservada 'implements'
public class ImplementacionMySql implements IAccesoDatos {
    // Implementación de los métodos abstractos, esto permite que se añada el 
    // comportamiento de la interface a la clase
    @Override
    public void insertar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
