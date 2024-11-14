
package dominio;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 800.000, false);
        System.out.println("persona1 -> Nombre: " + persona1.getNombre());
        System.out.println("persona1 -> Resultado del sueldo: $" + persona1.getSueldo());
        System.out.println("persona1 -> Obtener el booleano: " + persona1.isEliminado());
        
        System.out.println("toString - persona1: " + persona1);
        
        // Modificar a través de los métodos
        persona1.setNombre("Nelson");
        // persona1.nombre = "Nelson"; <- Ya no se puede utilizar
        // System.out.println("Nombre es: " + persona1.nombre); <- Error
        
        System.out.println("");
        System.out.println("Valores Modificados");
        System.out.println("persona1 -> Nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 -> Resultado del sueldo: $" + persona1.getSueldo());
        System.out.println("persona1 -> Obtener el booleano: " + persona1.isEliminado());
        
        /*
        TAREA:
            Crear otro objeto tipo Persona, asignar valores de manera inicial
            e imprimir, luego modificar sus valores y volver a imprimir.
        */
        
        System.out.println("");
        System.out.println("Tarea");
        // Creación de objeto e impresión
        Persona persona2 = new Persona("Paula", 50.000, false);
        System.out.println("persona2 -> Nombre: " + persona2.getNombre());
        System.out.println("persona2 -> Resultado del sueldo: $" + persona2.getSueldo());
        System.out.println("persona2 -> Obtener el booleano: " + persona2.isEliminado());
        
        System.out.println("toString - persona2: " + persona2);
        
        // Modificación de valores
        persona2.setNombre("Lautaro");
        persona2.setSueldo(25.000);
        System.out.println("");
        System.out.println("Valores Modificados");
        System.out.println("persona2 -> Nombre modificado: " + persona2.getNombre());
        System.out.println("persona2 -> Resultado del sueldo modificado: $" + persona2.getSueldo());
        System.out.println("persona2 -> Obtener el booleano: " + persona2.isEliminado());
        
        // Llamado al método toString
        // Al estar definido (en la clase Persona, no es necesario poner 
        // .toString() ya que lo hace de forma automática
        System.out.println("toString - persona1: " + persona1);
        System.out.println("toString - persona2: " + persona2);
    }
}
