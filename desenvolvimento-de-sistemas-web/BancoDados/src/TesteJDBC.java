import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteJDBC {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager
				.getConnection("jdbc:hsqldb:mem:banco-em-memoria", "", "");

		PreparedStatement createTable = conn.prepareStatement("CREATE TABLE Teste(valor int)");
		createTable.executeUpdate();
		createTable.close();

		PreparedStatement insert = conn.prepareStatement("INSERT INTO Teste VALUES (?), (?)");
		insert.setInt(1, 400);
		insert.setInt(2, 500);
		insert.executeUpdate();
		insert.close();

		ResultSet resultado = conn.prepareStatement("SELECT * FROM Teste").executeQuery();

		while (resultado.next()) {
			System.out.println(resultado.getInt("valor"));
		}

		resultado.close();

		conn.close();
	}

}
