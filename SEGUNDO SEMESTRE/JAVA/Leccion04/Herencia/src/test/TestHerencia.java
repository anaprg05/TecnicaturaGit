
package test;

import domain.Persona;
import domain.Empleado;
import domain.Cliente;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", 57000.0);
        System.out.println("empleado1 = " + empleado1);
    
//        Cliente cliente1 = new Cliente(new Date(), true, "Lucas", 'M', 20, "Poeta Risso 429");
//        System.out.println("cliente1 = " + cliente1);
//        
//        Persona persona1 = new Persona();
//        System.out.println("persona1 = " + persona1);
    }
}
