package domain;

public class Persona {
    // Atributos
    private final int idPersona;
    private static int contadorPersonas;
    
    // Los bloques de inicialización se ejecutan ANTES del constructor.
    // Bloque de inicialización estático
    // Este bloque se ejecuta una sola vez.
    // Solo permite utilizar atributos estáticos, otro tipo de atributos darían error. 
    static{
        System.out.println("Ejecución del bloque estático.");
        // Incremento del contador.
        ++Persona.contadorPersonas;
    }
    
    // Bloque de inicialización no estático o contexto dinámico
    // Este bloque se puede ejecutar más de una vez.
    // No es tan común ver este bloque.
    {
        System.out.println("Ejecución del bloque NO estático.");
        // Incrementación del atributo.
        this.idPersona = Persona.contadorPersonas++;
    }
    
    // Constructor
    public Persona(){
        System.out.println("Ejecución del constructor.");
    }
    
    // Método Get para recuperar el idPersona
    public int getIdPersona(){
        return this.idPersona;
    }

    // toString
    @Override
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + '}';
    }
}
