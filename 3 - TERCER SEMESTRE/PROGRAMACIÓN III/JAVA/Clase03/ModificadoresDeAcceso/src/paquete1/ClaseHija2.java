
package paquete1;

public class ClaseHija2 extends Clase2{
    // Constructor
    public ClaseHija2(){
        super();
        this.atributoDefault = "Modificación del Atributo Default.";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
}
