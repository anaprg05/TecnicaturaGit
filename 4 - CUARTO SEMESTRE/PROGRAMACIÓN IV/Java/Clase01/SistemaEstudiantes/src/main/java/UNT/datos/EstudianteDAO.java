package UNT.datos;

import UNT.dominio.Estudiante;
import static UNT.conexion.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    // Método por ID
    public boolean bucarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes.estudiantes2024 WHERE idestudiantes2024 = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setEmail(rs.getString("email"));
                estudiante.setTelefono(rs.getString("telefono"));
                return true; // -> Se encontró un registro
            } // Fin if
        }catch (Exception e){
            System.out.println("Ocurrió un error al buscar estudiante: " + e.getMessage());
        }// Fin catch
        finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexion: " + e.getMessage());
            }
        }// Fin finally
        return false;
    }

    // Método agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes.estudiantes2024(nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        }catch(Exception e){
            System.out.println("Ocurrió un error al agregar estudiante: " + e.getMessage());
        }// Fin catch
        finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexion: " + e.getMessage());
            }
        }
        return false;
    } // Fin método agregarEstudiante

    // Método para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes.estudiantes2024 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2024=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al modificar estudiante: " + e.getMessage());
        } // Fin Catch
        finally{
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrió un error al cerrar la conexion: " + e.getMessage());
            }
        } // Fin finally
        return false;
    } // Fin Método modificarEstudiante

    // Método para Eliminar Estudiante
    public boolean eliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM estudiantes.estudiantes2024 WHERE idestudiantes2024=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
        }// Fin Catch
        finally{
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrió un error al cerrar la conexion: " + e.getMessage());
            }
        } // Fin Finally
        return false;
    } // Fin Método eliminarEstudiante

    // PRUEBAS
    public static void main(String[] args) {
        // Variable global
        var estudianteDAO = new EstudianteDAO();

        /*
        // Agregar estudiante
        var nuevoEstudiante = new Estudiante("Milo", "Ríos", "mrios@gmail.com", "11 3446-2341");
        var agregado = estudianteDAO.agregarEstudiante(nuevoEstudiante);
        // Comprobación
        if(agregado)
            System.out.println("Estudiante agregado correctamente: " + nuevoEstudiante);
        else
            System.out.println("No se ha agregado estudiante: " + nuevoEstudiante);
         */

        // Eliminar estudiante
        var estudianteEliminar = new Estudiante(3);
        var eliminado = estudianteDAO.eliminarEstudiante(estudianteEliminar);
        if(eliminado)
            System.out.println("Estudiante eliminado: " + estudianteEliminar);
        else
            System.out.println("No se eliminó el estudiante: " + estudianteEliminar);

        // Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDAO.listarEstudiantes();
        // Función lambda para imprimir
        estudiantes.forEach(System.out::println);

        System.out.println();

        // Modificar estudiante
        var estudianteModificado = new Estudiante(6, "Nelson", "Ríos", "11 3456-2348", "nrios@gmail.com");
        var modificado = estudianteDAO.modificarEstudiante(estudianteModificado);
        // Comprobación
        if(modificado)
            System.out.println("Estudiante modificado correctamente: " + estudianteModificado);
        else
            System.out.println("No se modificó el estudiante: " + estudianteModificado);

        /*
        // Buscar por ID
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de la búsqueda: " + estudiante1);
        var encontrado = estudianteDAO.bucarEstudiantePorId(estudiante1);
        System.out.println();
        // Comprobación
        if(encontrado)
            System.out.println("Estudiante encontrado: " + estudiante1);
        else
            System.out.println("No se encontró el estudiante: " + estudiante1);
         */
    }
}
