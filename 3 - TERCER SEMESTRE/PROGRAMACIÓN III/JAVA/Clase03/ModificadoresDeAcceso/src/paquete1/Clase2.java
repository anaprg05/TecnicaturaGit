/* MODIFICADOR DE ACCESO DEFAULT O PACKAGE
    Trabaja con las clases que estén dentro del mismo paquete.
    Este modificador de acceso es la ausencia de un modificador. No puede ser 
  utilizada fuera de su paquete, por lo que no se puede utilizar en clases 
  hijas.
    Puede extender de otra clase (dentro del mismo paquete).
    Puede ser Clase Padre.
*/

package paquete1;

class Clase2{
    // Atributo
    String atributoDefault = "Valor Atributo Default.";
    
    // Constructores
    Clase2(){
        System.out.println("Constructor Default.");
    }
    
    //public Clase2(){
    //    super();
    //    this.atributoDefault = "Modificación del Atributo Default.";
    //    System.out.println("atributoDefault = " + this.atributoDefault);
    //    this.metodoDefault();
    //}
    
    // Método
    void metodoDefault(){
        System.out.println("Método Default.");
    }
}
