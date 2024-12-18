
package domain;

// Declaración de clase hija
// public class hija extends padre -> si no se coloca la palabra extends,
// no se toma como herencia
public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    // Constructores
    // 1. Constructor vacío
    public Empleado(){
        this.idEmpleado = ++ Empleado.contadorEmpleados;
    }
    
    // 2. Constructor con argumentos
    public Empleado(String nombre, double sueldo) {
        // super(nombre);
        // Llamada a un constructor interno (Constructor vacío)
        // No se pueden llamar al constructor vacío junto con 
        // el constructor de la clase padre
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    // Métodos Getter y Setter
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // toString
    @Override
    public String toString() {
        // StringBuilder -> Clase que crea un constructor vacío
        StringBuilder sb = new StringBuilder();
        // append -> Método 
        sb.append("Empleado{");
        sb.append("idEmpleado = ").append(idEmpleado);
        sb.append(", ").append(super.toString());
        sb.append(", sueldo = ").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
}
