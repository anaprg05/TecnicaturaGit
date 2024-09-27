
package Operaciones;

// Para las clases se utiliza el tipo de escritura "PascalCase"
public class Aritmetica {
    /* ATRIBUTOS DE LA CLASE
         Los atributos y métodos se escriben con minúscula al inicio para 
         diferenciarlos de una clase.*/
    // Atributo tipo entero (int)
    int a;
    int b;
    
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
     
}
