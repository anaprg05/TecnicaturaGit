package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Anotaciones
@Entity // Clase de Entidad -> representa una tabla de datos
@Data // Creación de métodos Get y Set
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con todos los arguementos
@ToString

// boilerplate (código repetitivo) - Constructores, Getters y Setters, toString, etc.

public class Estudiante {
    // Llave Primaria
    @Id // va agregando el orden del número de la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica cómo se va a generar el valor de la llave primaria
    // strategy = GenerationType.IDENTITY -> Es para llaves primarias autoincrementables
    private Integer idEstudiante;

    // Atributos
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
