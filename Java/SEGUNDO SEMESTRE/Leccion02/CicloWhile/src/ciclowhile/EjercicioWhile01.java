
package ciclowhile;

public class EjercicioWhile01 {

    public static void main(String[] args) {
        var conteo = 0; //Inferencia de tipos
        System.out.println("CICLO WHILE");
        while(conteo <= 7){
            System.out.println("conteo = " + conteo);
            conteo++; //Va aumentando en 1 la variable, el cual va a llegar hasta 7
        }
        
        System.out.println(" ");
        
        var contador = 0;
        System.out.println("CICLO DO WHILE");
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
        
        System.out.println(" ");
        
        System.out.println("CICLO FOR");
        for(var contando = 0; contando < 7; contando++){
            System.out.println("contando = " + contando);
        }
    }
}
