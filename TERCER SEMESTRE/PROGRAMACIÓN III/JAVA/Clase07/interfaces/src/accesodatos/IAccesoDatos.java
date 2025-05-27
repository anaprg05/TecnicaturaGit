/*
    A diferencia de las clases, las interfaces no heredan de la clase Object, 
pero si pueden heredarse entre interfaces.
    Cualquier método que se agregue a una interface, va a ser público y abstracto
por lo que se asigna de forma automática.
*/

package accesodatos;

public interface IAccesoDatos {
    // Atributo en interface -> No se puede declarar sin una asignación de valor.
    int MAX_REGISTRO = 10;
    
    // Métodos abstractos y sin cuerpo
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}
