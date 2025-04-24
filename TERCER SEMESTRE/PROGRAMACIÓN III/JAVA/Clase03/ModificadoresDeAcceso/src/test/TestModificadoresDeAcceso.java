
package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresDeAcceso {
    public static void main(String[] args) {
        // PUBLIC
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1);
        System.out.println("clase1 = " + clase1.atributoPublic);
        clase1.medotoPublico();
        
        // PROTECTED
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
        
    }
}
