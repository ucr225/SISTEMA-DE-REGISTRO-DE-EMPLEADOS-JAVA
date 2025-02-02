package Programa;

import java.sql.ResultSet;         // Importa la clase ResultSet para almacenar el resultado de una consulta SQL
import java.sql.SQLException;      // Importa la clase SQLException para manejar errores SQL
import java.sql.Connection;        // Importa la clase Connection para manejar la conexión con la base de datos
import java.sql.DriverManager;     // Importa la clase DriverManager para gestionar los controladores JDBC
import java.sql.Statement;         // Importa la clase Statement para ejecutar consultas SQL estáticas
import javax.swing.JOptionPane;    // Importa la clase JOptionPane para mostrar mensajes en cuadros de diálogo
import java.sql.PreparedStatement; // Importa la clase PreparedStatement para ejecutar consultas SQL parametrizadas

public class Datos {
    private static String url = "jdbc:sqlite:SGestion.db"; // URL de la base de datos SQLite
    static Connection connect = null;                      // Variable para la conexión a la base de datos
    static Statement state = null;                         // Variable para ejecutar consultas SQL estáticas

    // Método para conectar a la base de datos
    public static void conectarBD() {
        try {
            connect = DriverManager.getConnection(url);   // Establece la conexión a la base de datos
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Muestra un cuadro de diálogo en caso de error
        }
        try {
            state = connect.createStatement();            // Crea un Statement para ejecutar consultas SQL
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Muestra un cuadro de diálogo en caso de error
        }
    }

    // Método para cerrar la conexión con la base de datos
    public static void cerrarConexion() {
        try {
            if (connect != null) connect.close(); // Cierra la conexión a la base de datos si está abierta
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Muestra un cuadro de diálogo en caso de error
        }
    }

    // Método para registrar datos en la base de datos
    public static void registro(String nombre, String apellido, int cedula, String genero,
                                String correo, String direccion, int edad) {
        conectarBD(); // Conecta a la base de datos
        PreparedStatement preparedStatement = null;

        try {
            String query = "INSERT INTO EMPLEADOS (NOMBRE, APELLIDO, CEDULA, GENERO, CORREO, DIRECCION, EDAD) VALUES (?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connect.prepareStatement(query); // Prepara la consulta SQL

            // Establece los valores de los parámetros
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, cedula);
            preparedStatement.setString(4, genero);
            preparedStatement.setString(5, correo);
            preparedStatement.setString(6, direccion);
            preparedStatement.setInt(7, edad);

            preparedStatement.executeUpdate(); // Ejecuta la consulta

            JOptionPane.showMessageDialog(null, "EMPLOYEE CREATED SUCCESSFULLY", "INFO", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Muestra un cuadro de diálogo en caso de error
        } finally {
            cerrarConexion(); // Cierra la conexión a la base de datos
        }
    }

    // Método para consultar datos en la base de datos
    public static void consulta(int cedula) {
        conectarBD(); // Conecta a la base de datos
        System.out.println(cedula); // Imprime la cédula ingresada (para depuración)

        try {
            String query = "SELECT NOMBRE FROM EMPLEADOS WHERE CEDULA = ?"; // Consulta SQL para obtener el nombre basado en la cédula
            PreparedStatement preparedStatement = connect.prepareStatement(query); // Prepara la consulta SQL
            preparedStatement.setInt(1, cedula); // Establece el valor de la cédula en la consulta

            ResultSet resultset = preparedStatement.executeQuery(); // Ejecuta la consulta y obtiene el resultado
            if (resultset.next()) { // Verifica si hay un resultado
                String nombre = resultset.getString("NOMBRE"); // Obtiene el nombre del resultado
                System.out.println(nombre); // Imprime el nombre
            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE UN USUARIO CON ESA CÉDULA", query, JOptionPane.ERROR_MESSAGE); // Muestra un cuadro de diálogo si no se encuentra un usuario
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Muestra un cuadro de diálogo en caso de error
        } finally {
            cerrarConexion(); // Cierra la conexión a la base de datos
        }
    }
}
