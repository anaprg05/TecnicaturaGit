/* MODIFICADOR DE ACCESO PROTECTED
    Permite a las Clases Hijas acceder a los atributos de la Clase Padre.
    Los constructores no se heredan, se llaman con super. Pero, en caso de que
  el constructor sea privado, ni siquiera utilizando super se puede llamar.
*/

package paquete2;

import paquete1.Clase1;

// No existe tal cosa como una clase protected
// protected class Clase3 <- No existe

public class Clase3 extends Clase1{
    // Constructor
    public Clase3(){
        super("protected.");
        this.atributoProtected = "Accedemos desde la Clase Hija.";
        System.out.println("atributoProtected = " + this.atributoProtected);
        this.atributoPublic = "Es totalmente público.";
    }
}
