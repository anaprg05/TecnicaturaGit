package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Anotaciones
@Entity // Clase de Entidad -> representa una tabla de datos
@Table(name = "estudiantes2024", schema = "estudiantes") // Vinculación directa con la tabla en la BD
@Data // Creación de métodos Get y Set
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con todos los argumentos
@ToString

// boilerplate (código repetitivo) - Constructores, Getters y Setters, toString, etc.
public class Estudiante {

    // Llave Primaria
    @Id // Identifica la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // strategy = GenerationType.IDENTITY -> Es para llaves primarias autoincrementables en MySQL
    @Column(name = "idestudiantes2024") // Vincula con la columna real de la tabla
    private Integer idEstudiante;

    // Atributos
    @Column(name = "nombre")   // Vincula con la columna "nombre"
    private String nombre;

    @Column(name = "apellido") // Vincula con la columna "apellido"
    private String apellido;

    @Column(name = "telefono") // Vincula con la columna "telefono"
    private String telefono;

    @Column(name = "email")    // Vincula con la columna "email"
    private String email;
}
