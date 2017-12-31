package sistema.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/db_cadastro_pessoa";
		String user = "root";
		String password = "";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("Conecção Criada!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	public static Connection closeConnection(Connection conn){
		if(conn != null){
			try {
				conn.close();
				//System.out.println("Conexao Fechada!!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
