package Programa;

import java.sql.ResultSet;         // Importa la clase ResultSet para almacenar el resultado de una consulta SQL
import java.sql.SQLException;      // Importa la clase SQLException para manejar errores SQL
import java.sql.Connection;        // Importa la clase Connection para manejar la conexión con la base de datos
import java.sql.DriverManager;     // Importa la clase DriverManager para gestionar los controladores JDBC
import java.sql.Statement;         // Importa la clase Statement para ejecutar consultas SQL estáticas

import javax.swing.JOptionPane;

import java.sql.PreparedStatement; // Importa la clase PreparedStatement para ejecutar consultas SQL parametrizadas

// Aquí podrías añadir el resto de tu código para establecer una conexión y ejecutar consultas.




public class Datos {
	private static String url = "jdbc:sqlite:SGestion.db";
	static Connection connect = null;
	static Statement state = null;
	
	
	
	public static void conectarBD() {
        try {
            connect = DriverManager.getConnection(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        try {
            state = connect.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
	
	
	
	// Cierra la conexión con la base de datos
    public static void cerrarConexion() {
        try {
            connect.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void registro(String nombre, String apellido, int cedula, String genero,
            String correo, String direccion, int edad) {
    	
    	conectarBD();
    	PreparedStatement preparedStatement= null;
    	
        try {
            String querry = "INSERT INTO EMPLEADOS (NOMBRE,APELLIDO,CEDULA,GENERO,CORREO,DIRECCION,EDAD) VALUES (?,?,?,?,?,?,?)";
            
            preparedStatement = connect.prepareStatement(querry);          
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,apellido);
            preparedStatement.setInt(3,cedula);
            preparedStatement.setString(4,genero);
            preparedStatement.setString(5,correo);
            preparedStatement.setString(6,direccion);
            preparedStatement.setInt(7,edad);
            //preparedStatement.setInt(8,telefono);
            preparedStatement.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "SE HA INSERTADO UN EMPLEADO CON EXITO", "INFO", JOptionPane.OK_OPTION);
            
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    	
    	cerrarConexion();
    	
    	
    	
    	
    }
    
    
    public static void consulta(int cedula) {
    	conectarBD();
    	//PreparedStatement preparedStatement= null;

    	
    	
    	 System.out.println(cedula);
    	
    	try {
            
            
            String querry = "SELECT NOMBRE FROM EMPLEADOS WHERE CEDULA = ?";
            // "DELETE  FROM EMPLEADOS WHERE CEDULA = ?";
            PreparedStatement preparedStatement=connect.prepareStatement(querry);
            preparedStatement.setInt(1,cedula);
            //OJO PARA BORRAR
            ResultSet resultset = preparedStatement.executeQuery();
            
            String nombre = resultset.getString("NOMBRE");
           
            System.out.println(nombre);
            
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "NO EXISTE UN USUARIO CON ESA CEDULA", JOptionPane.ERROR_MESSAGE);
        }
    	
    	cerrarConexion();
    }
	
	
}

