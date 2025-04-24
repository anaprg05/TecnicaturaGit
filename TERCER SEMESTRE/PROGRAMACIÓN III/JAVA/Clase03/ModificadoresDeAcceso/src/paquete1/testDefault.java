
package paquete1;

import paquete2.Clase4;

public class testDefault {
    public static void main(String[] args) {
        // Clase2 clase2 = new Clase2();
        // System.out.println("clase2 = " + clase2);
        
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atributoDefault = "Cambio desde la prueba.";
        System.out.println("claseH2 Atributo Default = " + claseH2.atributoDefault);
        
        Clase4 clase4 = new Clase4("Public.");
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("Cambio.");
        System.out.println("clase4 = " + clase4.getAtributoPrivate());
    }
}
