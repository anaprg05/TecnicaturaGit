
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
    
    var edadTexto = String.valueOf(10);
    System.out.println("edadTexto = " + edadTexto);
    
    var fraseChar = "programadores".charAt(4);
    System.out.println("fraseChar = " + fraseChar);
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite un caracter: ");
    fraseChar = entrada.nextLine().charAt(0);
    System.out.println("fraseChar = " + fraseChar);
    
    //OPERADORES ARITMÉTICOS
    // Forma de inicializar más de una variable.
    int num1 = 5, num2 = 4;
    var solucion = num1 + num2; //num1 y num2 son int, por eso var no los concatena.
    System.out.println("Solución de la suma = " + solucion);
    
    solucion = num1 - num2;
    System.out.println("Solución de la resta = " + solucion);
    
    solucion = num1 * num2;
    System.out.println("Solución de la multiplicación = " + solucion);
    
    solucion = num1 / num2;
    System.out.println("Solución de la división = " + solucion);
    
    var solucion2 = 3.4 / num2;
    System.out.println("Segunda solución de la división = " + solucion2);
    
    solucion = num1 % num2; //Guarda el residuo entero de la división.
    System.out.println("Solución del módulo = " + solucion);
    
    if (num1 % 2 == 0){
        System.out.println("El número es par.");
    }
    else{
        System.out.println("El número es impar.");
    }
    
    //OPERADORES DE ASIGNACIÓN o COMPOSICIÓN 
    int varNum1 = 1, varNum2 = 4;
    int varNum3 = varNum1 + 6 - varNum2; //Una operación.
    System.out.println("varNum3 = " + varNum3);
    
    varNum1 += 1; //varNum1 = varNum1 + 1;
    System.out.println("varNum1 = " + varNum1);
    
    //OPERADORES UNARIOS
    //Cambio de Signo
    var varA = 7;
    var varB = -varA;
    System.out.println("varA = " + varA); //Núm positivo
    System.out.println("varB = " + varB); //Mismo núm, pero con el signo negativo
    
    //Operador de Negación
    var varC = true; // Esta literal por default en Java es de tipo boolean.
    var varD = !varC; // Aquí se invierte el valor.
    System.out.println("varC = " + varC);
    System.out.println("varD = " + varD);
    
    //Operadores Unarios de Incremento: Preincremento
    var varE = 9;
    var varF = ++varE;
    //Primero se incrementa la variable y despues se usa.
    System.out.println("varE = " + varE); //Se incrementa en la unidad.
    System.out.println("varF = " + varF); //Va a sumar uno.
    
    //Postincremento (el símbolo va después de la variable)
    var varG = 3;
    var varH = varG++; //Primero el valor de la variable.
    System.out.println("varG = " + varG);
    System.out.println("varH = " + varH);
    
    //Operadores Unarios de Decremento
    var varI = 4;
    var varJ = --varI;
    System.out.println("varI = " + varI); //La variable ya está con decremento.
    System.out.println("varJ = " + varJ);
    
    //Postdecremento
    var varK = 8;
    var varL = varK--;
    System.out.println("varK = " + varK); //Aquí va a decrementar en 1.
    System.out.println("varL = " + varL);
        
        //OPERADORES DE IGUALDAD
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum); //Si son desiguales, imprime false, si son iguales, imprime true.

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB; //Comparación de referencia.
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB); //Comparación de contenido.
        System.out.println("fVar = " + fVar);

        //OPERADORES RELACIONALES
        //  > >= < <= == !=
        var gVar = aNum != bNum;
        System.out.println("gVar = " + gVar);

        if (bNum % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        var edad = 30;
        var adulto = edad >= 18;
        if (adulto){
            System.out.println("Usted es mayor de edad.");
        }
        else{
            System.out.println("Usted es menor de edad.");
        }
         
        //OPERADORES CONDICIONALES
        //AND: &&
        var valorA = 11;
        var valorMin = 0;
        var valorMax = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Estpa dentro del rango establecido.");
        } else {
            System.out.println("Está fuera del rango establecido.");
        }

        //OR: ||
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones || diaLibre){
            System.out.println("Papá puede asistir al juego de su hijo.");
        }
        else{
            System.out.println("Papá no puede asistir al juego de su hijo.");
        }
        
        //OPERADOR TERNARIO
        //Consta de tres partes:
        // 1. Condición a evaluar.
        // 2. Según la condición evaluada, va a dar/regresar un valor.
        // 3. Va a dar/regresar un valor diferente al anterior.
        //                 1           2           3
        //             Condición    Valor 1      Valor 2
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso"; // Los signos (? :) separan los dos resultados (V/F)
        System.out.println("resultadoT = " + resultadoT);
        
        //PRIORIDAD DE LOS OPERADORES
        var x = 5;
        var y = 10;
        var z = (++x + y--);
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 * 6)/ 3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        //Los paréntesis cambian la prioridad.
        solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        //SENTENCIA IF - IF ELSE
        var condicion = false;
        if(condicion){
            System.out.println("Condición verdadera"); //Condicional simple.
        }
        else{
            System.out.println("Condición falsa."); //Condicinal doble.
        }
        */
        //SENTENCIA SWITCH 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 4: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor desconocido";
        switch(numero){
            case 1:
                numeroTexto = "Número 1";
                break;
            case 2:
                numeroTexto = "Número 2";
                break;
            case 3:
                numeroTexto = "Número 3";
                break; 
            case 4:
                numeroTexto = "Número 4";
                break;
                
            default:
                numeroTexto = "Caso no encontrado.";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
