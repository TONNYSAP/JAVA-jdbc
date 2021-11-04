package connectionManipulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	public static Connection getConect() {
		
		String url = "jdbc:mysql://localhost:3306/cadastro";
		String user = "root";
		String password ="";
		
		try {						
			return DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}
	
	public static void close(Connection connection) {
		try {
			if(connection != null) 
				connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void close(Connection connection, Statement stmt) {
		close(connection);
		try {
			if(stmt != null) 
				stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void close(Connection connection, Statement stmt, ResultSet rs) {
		close(connection, stmt);
		try {
			if(rs != null) 
				rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
}
