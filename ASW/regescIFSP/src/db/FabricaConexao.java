package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConnection() {
		//realiza a conexão com o banco
		
		String url = "jdbc:mysql://localhost:3306/regescifsp";
		//jdbc:mysql: => chama o conector do banco
		String username = "root";
		String password = "";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
