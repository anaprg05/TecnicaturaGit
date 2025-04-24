/* MODIFICADOR DE ACCESO PUBLIC
    Aplica para todo (Clase, Variable, Método, Constructor).
    Puede ser utilizada desde otra clase, ya sea del mismo paquete o de uno
  externo.
*/

package paquete1;

public class Clase1 {
    // Atributos
    public String atributoPublic = "Valor Atributo Public.";
    protected String atributoProtected = "Valor Atributo Protected.";
    
    // Constructores
    public Clase1(){
        System.out.println("Constructor Public.");
    }
    
    protected Clase1(String atributoPublic){
        System.out.println("Constructor Protected.");
    }
    
    // Métodos
    public void medotoPublico(){
        System.out.println("Método Public.");
    }
    
    protected void metodoProtected(){
        System.out.println("Método Protected.");
    }
}
