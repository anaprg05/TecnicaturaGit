
package Operaciones;

// Para las clases se utiliza el tipo de escritura "PascalCase"
public class Aritmetica {
    /* ATRIBUTOS DE LA CLASE
         Los atributos y métodos se escriben con minúscula al inicio para 
         diferenciarlos de una clase.*/
    // Atributo tipo entero (int)
    int a;
    int b;
    
    // CONSTRUCTORES Y SOBRECARGA DE CONSTRUCTORES
    /* Constructor -> Método especial.
            - Construye un objeto.
            - Reserva un espacio de memoria.
            - Inicializa los atributos de la clase.
    */
    // Constructor por defecto
    // Constructor 1 - Sin parámetros (Omitiendo valores, vacío)
    public Aritmetica(){
        System.out.println("Se está ejecutando este constructor número uno.");
    }
    
    // Sobrecarga de Constructores
    // Constructor 2 - Con parámetros (Asignando valores, inicializando atributos)
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando este constructor número dos.");        
    }
    
    // Método
    // Está conformado por:
    // Modificador de Acceso + Lo que se devuelve + Identificador del Método(Atributos)
    // Para los métodos se utiliza el tipo de escritura "camelCase"
    public void sumarNumeros(){
        //Cuerpo de la clase
        // Variables Locales -> Estas variables se crean y se destruyen 
        //                      al terminar de ejecutar.
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        // Dentro del bloque se puede poner una variable o una expresión.
        // Variable
        // int resultado = a + b;
        // return resultado;
        
        // Expresión
        return a + b;
    }
    
    // Argumento -> Información que va a recibir el método
    // Los argumentos que se encuentran dentro del paréntesis son parte de la firma
    public int sumarConArgumentos(int arg1, int arg2){
        // No modifican los valores del atributo del objeto
        // a = arg1;
        // b = arg2;
        
        // Operador This
        // Este operador hace referencia a un atributo y no a una variable local
        // Se utiliza para que el código sea más legible
        // Los atributos y los argumentos pueden tener el mismo nombre
        // El argumento a se asigna al atributo this.a
        this.a = arg1;
        // El argumento b se asigna al atributo this.b
        this.b = arg2;
        
        // return a + b;
        // Llamado a un mismo método dentro de la misma clase
        return this.sumarConRetorno();
        
    /* Memoria Stack y Memoria Heap
        - Clasificación de la memoria.
        Stack -> Almacena la referencia del objeto (Variables Locales).
        Heap -> Almacena objetos o atributos.
    */
    /* Tratamiento de Residuos
        - No es necesario utilizar una forma de limpieza de residuos después de
        haber utilizado el programa, como por ejemplo:
            sobrecargaDeConstructor = null;
            System.gc(); -> Método para limpiar residuos, muy pesado, no usar.
    */
        
    }
}
