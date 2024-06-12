
import java.util.Scanner;

public class HolaMundo { 
    public static void main(String[] args) {
    /*
        System.out.println("Hola mundo desde Java");
        
        //TIPOS DE VARIABLES
        //Tipo Entero
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        
        //Tipo String
        String miVariableCadena = "Bienvenida";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
    
    //Var - Inferencia de tipos en Java
    var miVariableEntera2 = 10;
    var miVariableCadena2 = "Seguimos estudiando";
    System.out.println("miVariableEntera2 = " + miVariableEntera2); 
    System.out.println("miVariableCadena2 = " + miVariableCadena2); //soutv + tab
    
    //                  PALABRAS RESERVADAS
    //  abstract  continue  for         new        switch
    //  assert    default   goto        package    synchronized
    //  boolean   do        if          private    this
    //  break     double    implements  protected  throw
    //  byte      else      import      public     throws
    //  case      enum      instaceof   return     transient
    //  catch     extends   int         short      try
    //  char      final     interface   static     void
    //  class     finally   long        strictfp   volatile
    //  const     float     native      super      while
    
    // REGLAS PARA DEFINIR UNA VARIABLE EN JAVA
    //  1. Se recomienda el tipo de escritura camelCase, de todas formas se puede utilizar cualquier letra.
    //  2. No se puede utilizar números como primer caracter de una variable.
    //  3. No puede contener caracteres especiales.
    //  4. Puede tener guión bajo.
    //  5. Se puede utilizar el signo dólar.
    //  6. Se pueden utilizar acentos, pero no es recomendable.
     
    // EJERCICIO CONCATENACIÓN - Clase 3
        var usuario = "Ana";
        var titulo = "Técnica";
        var union = titulo + " " + usuario;
        System.out.println("Unión = " + union);
   
    var a = 8;
    var b = 4; 
    System.out.println(usuario + (a + b));
    
    // EJERCICIO CARACTERES ESPECIALES - Clase 3
    var nombre = "Paula";
    // Diagonal Inversa y 'n': \n 
    System.out.println("Nueva línea: \n" + nombre);
    
    // Tabulador: \t
    System.out.println("Tabulador: \t" + nombre);
    
    // Caracter de Retroceso: \b
    System.out.println("Retroceso: \b" + nombre);
    
    //Comilla Simple: \'
    System.out.println("Comillas simples: \'" + nombre + "\'");
    
    //Comilla Doble: \"
    System.out.println("Comillas doble: \"" + nombre + "\"");
    
    //CLASE SCANNER
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese su nombre: ");
    var usuario2 = entrada.nextLine();
    System.out.println("usuario2 = " + usuario2);
    System.out.println("Escriba el título: ");
    var titulo2 = entrada.nextLine();
    System.out.println("Resultado: " + titulo2 + " " + usuario2);
    
    // CLASES DE ENTEROS
    // byte
    byte numEnteroByte = (byte)127;
    System.out.println("numEnteroByte = " + numEnteroByte);
    System.out.println("Valor mínimo del Byte: " + Byte.MIN_VALUE);
    System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);
    
    // short
    short numEnteroShort = (short)32767;
    System.out.println("numEnteroShort = " + numEnteroShort);
    System.out.println("Valor mínimo del Short: " + Short.MIN_VALUE);
    System.out.println("Valor máximo del Short: " + Short.MAX_VALUE);
    
    // int
    int numEnteroInt = 2147483647;
    System.out.println("numEnteroInt = " + numEnteroInt);
    System.out.println("Valor mínimo del Int: " + Integer.MIN_VALUE);
    System.out.println("Valor máximo del Int: " + Integer.MAX_VALUE);

    // long
    long numEnteroLong = 9223372036854775807L;
    System.out.println("numEnteroLong = " + numEnteroLong);
    System.out.println("Valor mínimo del Long: " + Long.MIN_VALUE);
    System.out.println("Valor máximo del Long: " + Long.MAX_VALUE);
    
    // CLASES FLOTANTES
    // float - Se puede usar (float) o solo la F (más recomendado)
    float numFloat = (float)3.4028235E38F;
    System.out.println("numFloat = " + numFloat);
    System.out.println("Valor mínimo del Float: " + Float.MIN_VALUE);
    System.out.println("Valor máximo del Float: " + Float.MAX_VALUE);    
    
    // double
    double numDouble = 1.7976931348623157E308D;
    System.out.println("numDouble = " + numDouble);
    System.out.println("Valor mínimo del Double: " + Double.MIN_VALUE);
    System.out.println("Valor máximo del Double: " + Double.MAX_VALUE);    
    
    // INFERENCIA DE TIPOS VAR Y TIPOS PRIMITIVOS
    var numEntero = 20; //Las literales sin punto, automáticamente son de tipo int.
    System.out.println("numEntero = " + numEntero);
    var numFloat = 10.0F; //Automáticamente, con el punto decimal, se transforma en tipo 'double'
    System.out.println("numFloat = " + numFloat);
    var numDouble = 10.0;
    System.out.println("numDouble = " + numDouble);
    
    // TIPOS PRIMITIVOS - CHAR
    char miVariableChar = 'a';
    System.out.println("miVariableChar = " + miVariableChar);
    
    char varCaracter = '\u0024'; //Indicamos a Java la asignación con el código unicode.
    System.out.println("varCaracter = " + varCaracter);
    
    char varCaracterDecimal = 36; //Valor decimal del juego de caracteres unicode.
    System.out.println("varCaracterDecimal = " + varCaracterDecimal);
    
    char varCaracterSimbolo = '$'; //Un caracter especial, podemos copiar y pegar desde unicode.
    System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
    
    //VAR    
    var miVariableChar1 = 'a';
    System.out.println("miVariableChar1 = " + miVariableChar1);
    
    var varCaracter1 = '\u0024'; //Valor entero y le asigna un tipo int.
    System.out.println("varCaracter1 = " + varCaracter1);
    
    var varCaracterDecimal1 = (char)36; //Valor decimal del juego de caracteres unicode.
    System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
    
    var varCaracterSimbolo1 = '$'; //Un caracter especial, podemos copiar y pegar desde unicode.
    System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
    
    //INT    
    int varEnteroChar = '$';
    System.out.println("varEnteroChar = " + varEnteroChar);
    
    int caracterChar = 'b';
    System.out.println("caracterChar = " + caracterChar);
    
    //TIPOS PRIMITIVO -> TIPOS BOOLEANOS
    boolean varBool = false;
    System.out.println("varBool = " + varBool);
    
    if (varBool == true){
        System.out.println("La bandera es verde.");
    }
    else{
        System.out.println("La bandera es roja.");
    }
    
    //CONVERSIÓN DE TIPOS PRIMITIVOS
    var edad = "20";
    System.out.println("edad = " + (edad + 1));
    
    var valorPI = Double.parseDouble("3.1416");
    System.out.println("valorPI = " + valorPI);
    */
    var edadTexto = String.valueOf(10);
    System.out.println("edadTexto = " + edadTexto);
    
    var fraseChar = "programadores".charAt(4);
    System.out.println("fraseChar = " + fraseChar);
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite un caracter: ");
    fraseChar = entrada.nextLine().charAt(0);
    System.out.println("fraseChar = " + fraseChar);
    
    
    }   
}
