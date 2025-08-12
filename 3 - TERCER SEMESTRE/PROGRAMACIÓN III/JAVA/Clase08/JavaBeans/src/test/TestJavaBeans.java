
package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        // Uso estricto del Setter
        persona.setNombre("Ana");
        persona.setApellido("Ríos");
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre: " + persona.getNombre());
        System.out.println("Persona apellido: " + persona.getApellido());
    }
}
