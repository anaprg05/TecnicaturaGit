
package Operaciones;

// Clase pública
public class PruebaAritmetica {
    // Método MAIN
    public static void main(String[] args) {
        /*Alcance de variables
            - Las variables solo se pueden utilizar dentro del método que se definió.
            - Las variables se pueden llamar a través de otros métodos.
        */
        // Creación de variables locales (int o var)
        // var -> se puede utilizar para las variables locales
        var a = 10;
        var b = 7;
        
        // Llamado al método
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);
        
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
        // var -> nunca se debe utilizar para los parámetros
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        
        Persona persona = new Persona("Ana", "Ríos");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre = " + persona.nombre);
        System.out.println("Persona apellido = " + persona.apellido);
    }
    
    // Modularidad -> crear un nuevo método 
    // Creación de nuevo método
    public static void miMetodo(){
        // Creación de una variable
        // Saltará error ya que la variable no puede trascender del método main 
        // al nuevo método.
        // a = 10;
        
        // Para evitar este error, hay que llamar desde el main al método "miMetodo"
        System.out.println("Aquí hay otro método.");
    }  
}

// Creación de clase (default o package)
class Persona{
    // Atributos
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        // Llamada al método constructor clase padre 'Object'
        super();
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        
        this.nombre = nombre;
        this.apellido = apellido;
        
        System.out.println("Objeto persona usando this: " + this);
    }
    
    class Imprimir{
        public Imprimir(){
            super();
        }
        
        public void imprimir(Persona persona){
            System.out.println("Persona de la clase imprimir: " + persona);
            System.out.println("Impresión del objeto actual (this): " + this);
        }
    }
}
