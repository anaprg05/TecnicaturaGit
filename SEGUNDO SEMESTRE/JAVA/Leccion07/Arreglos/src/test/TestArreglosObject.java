
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        // Creación de arreglo tipo object
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Ana");
        personas[1] = new Persona("Lucas");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
    }
}
