
package test;

import accesodatos.*;

public class TestInterfaces {
    // Main
    public static void main(String[] args) {
        // Definición de variable tipo interface
        // Para instanciar hay que usar una de las clases dentro de la interface
        // debido a que una interface en sí NO se puede instanciar.
        IAccesoDatos datos = new ImplementacionMySql();
        
        // Con la variable de tipo interface se aplica el polimorfismo
        // datos.listar();
        // imprimir(datos);
        
        datos = new ImplementacionOracle();
        // datos.listar();
        imprimir(datos);
    }
    
    // Método genérico
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
