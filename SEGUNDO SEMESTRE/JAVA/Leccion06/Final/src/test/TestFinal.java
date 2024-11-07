/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo dónde se aplique:
    - Variables: Evita cambiar el valor que almacena la variable.
    - Métodos: Evita que se modifique la definición o el comportamiento de un
               método desde una subclase (clase hija).
    - Clases: Evita que se creen clases hijas.
Otra característica es que normalmente, cuando se trabaje con variables se
combina con el modificador de acceso estático para convertir una variable en 
una constante, es decir que no se puede modificar su valor, el ejemplo de esto
es la clase 'Math' en la cual todos sus atributos son de tipo 'static' y 
'final', es por esto que la varible pi* se conoce como una constante.
*/

package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        // Final - Variables
        final int miDni = 46422681;
        System.out.println("miDni = " + miDni);
        // Si se desea modificar/reasignar la variable, mostrará error
        // miDni = 48332899;
        // No dejará sobreescribir la constante por la palabra final
        //Persona.CONSTANTE_AQUI = 9;
        System.out.println("Atributo constante: " + Persona.CONSTANTE_AQUI);
                
        // Final - Objetos
        // No se puede modificar la referencia, pero si el contenido
        final Persona persona1 = new Persona();
        // persona1 = new Persona(); <- No se puede asignar una nueva referencia
        persona1.setNombre("Ana Paula");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Lucas");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}
