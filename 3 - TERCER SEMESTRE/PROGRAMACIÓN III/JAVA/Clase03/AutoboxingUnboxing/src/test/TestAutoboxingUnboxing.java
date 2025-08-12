/* AUTOBOXING Y UNBOXING
    Cada uno de los tipos primitivos en Java asociada una clase Wrapper o 
  envolvente del tipo primitivo. 
    Clases envolventes para cada tipo:
    - Int -> Integer
    - long -> Long
    - float -> Float
    - double -> Double
    - boolean -> Boolean
    - byte -> Byte
    - char -> Character
    - short -> Short
*/

package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // Atributos Primitivos
        int enteroPrim = 10;
        System.out.println("enteroPrim = " + enteroPrim);
        
        // Clases Wrapper o Envolventes
        // Cuando se utiliza una de estas clases, pueden utilizarse métodos o
        // conversiones directamente desde el objeto.
        Integer entero = 10; // Tipo object
        // Autoboxing
        System.out.println("entero = " + entero.doubleValue()); 
        
        // Unboxing
        // Se extrae la literal del objeto y se asigna a la variable.
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
