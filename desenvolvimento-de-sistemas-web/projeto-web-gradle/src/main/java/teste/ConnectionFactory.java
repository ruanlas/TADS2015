package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hsqldb.jdbc.JDBCDriver;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(JDBCDriver.class.getName());
		return DriverManager.getConnection("jdbc:hsqldb:mem:banco-em-memoria", "", "");
	}
}
