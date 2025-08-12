/* MODIFICADOR DE ACCESO PRIVATE
    No aplica en clases. Es decir, los atributos no podrán ser modificados 
  desde ninguna clase, incluso si es hija o del mismo paquete.
    La forma de acceder a un constructor es a través de parámetros. Es decir,
  puede haber un constructor private (el cual puede estar vacío) pero para 
  acceder hay que crear uno público.
    No se puede realizar nada si no es a través de un método Getter o Setter.
*/

package paquete2;

// private class Clase4 <- no se puede.
public class Clase4 {
    // Atributo
    private String atributoPrivate = "Atributo Private";
    
    // Constructores
    // Privado
    private Clase4(){
        System.out.println("Constructor Private.");
    }
    
    // Público
    public Clase4(String argumento){
        // Llamado al constructor vacío
        this();
        System.out.println("Constructor Public.");
    }
    
    // Métodos
    private void metodoPrivado(){
        System.out.println("Método Private.");
    }

    // Getter
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    // Setter
    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
