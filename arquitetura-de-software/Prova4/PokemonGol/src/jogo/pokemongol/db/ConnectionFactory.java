package jogo.pokemongol.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/pokemongol";
		String user = "root";
		String password = "";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("OK");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
