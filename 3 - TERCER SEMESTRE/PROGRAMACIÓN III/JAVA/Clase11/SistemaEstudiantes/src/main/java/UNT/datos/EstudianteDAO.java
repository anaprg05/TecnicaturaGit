package UNT.datos;

import UNT.dominio.Estudiante;
import static UNT.conexion.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    // Método Listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // Objetos necesarios para la comunicación con la base de datos
        // PreparedStatement: Introduce la sentencia; ResultSet: Muestra el resultado
        PreparedStatement ps;
        ResultSet rs;

        // Objeto de tipo Conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes.estudiantes2024 ORDER BY idestudiantes2024";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            // Mientras hayan registros para iterar
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2024"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // Agregar a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        }
        finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexión: " + e.getMessage());
            }
        } // Fin finally
        return estudiantes;
    } // Fin método listar

    public static void main(String[] args) {
        // Listar los estudiantes
        var estudianteDAO = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDAO.listarEstudiantes();
        // Función lambda para imprimir
        estudiantes.forEach(System.out::println);
    }
}
