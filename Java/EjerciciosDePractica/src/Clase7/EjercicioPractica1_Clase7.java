
// Ejercicio Práctica 1 - Clase 7:
//  Utilizar los operadores de asignación NO vistos en clase.
//      Resta: -=
//      Multiplicación: *=
//      División: /=
//      Módulo: %=

public class EjercicioPractica1_Clase7 {
    public static void main(String[] args) {
    //OPERADORES DE ASIGNACIÓN O COMPOSICIÓN VISTOS EN CLASE
    int varNum1 = 1, varNum2 = 4;
    //SUMA
    int varNum3 = varNum1 + 6 - varNum2; //Una operación.
    System.out.println("varNum3 = " + varNum3);
    varNum1 += 1; //varNum1 = varNum1 + 1;
    System.out.println("varNum1 = " + varNum1);
    
    //RESTA
    varNum2 -= 1;
    System.out.println("varNum2 = " + varNum2);
    
    //MULTIPLICACIÓN
    varNum3 *= 2;
    System.out.println("varNum3 = " + varNum3);
    
    //DIVISIÓN
    varNum2 /= 2;
    System.out.println("varNum2 = " + varNum2);
    
    //MÓDULO
    varNum2 %= 2;
    System.out.println("varNum2 = " + varNum2);
    }
}
