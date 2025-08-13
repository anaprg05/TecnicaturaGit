package UNT.conexion;

// Importación de interface
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        // Variable de conexión inicializada en 'null'
        Connection conexion = null;
        // Variables para la conexión a la base de datos
        var baseDatos = "estudiantes";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "admin";

        // Clase del driver de MySQL en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException E) {
            System.out.println("Ocurrió un error en la conexión: " + E.getMessage());
        } // Fin Catch
    return conexion;
    } // Fin Método Connection
}
