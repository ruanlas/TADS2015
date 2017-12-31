import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hsqldb.jdbcDriver;
import org.hsqldb.jdbc.JDBCDriver;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class DataBase {
	private Connection conn;
	
	public DataBase() throws SQLException, ClassNotFoundException {
		Class.forName(JDBCDriver.class.getName());
		this.conn = DriverManager
				.getConnection("jdbc:hsqldb:mem:banco-em-memoria2", "", "");
		
		PreparedStatement createTable = conn.prepareStatement("CREATE TABLE Teste(id int, nome varchar(50), cpf varchar(50), rg varchar(50))");
		createTable.executeUpdate();
		createTable.close();
	}
	
	public void insertPagador(Pagador pagador) throws SQLException {
		PreparedStatement insert = conn.prepareStatement("INSERT INTO Teste VALUES (?, ?, ?, ?)");
		insert.setInt(1, pagador.getId());
		insert.setString(2, pagador.getNome());
		insert.setString(3, pagador.getCpf());
		insert.setString(4, pagador.getRg());
		insert.executeUpdate();
		insert.close();
	}
	
	private List<Pagador> getPagadores() throws SQLException {
		ArrayList<Pagador> listaPagadores = new ArrayList<>();
		ResultSet resultado = conn.prepareStatement("SELECT * FROM Teste").executeQuery();
		
		while (resultado.next()) {
			listaPagadores.add(new Pagador(resultado.getInt("id"),  resultado.getString("nome"), resultado.getString("cpf"), resultado.getString("rg")));
		}
		resultado.close();
		conn.close();
		return listaPagadores;
	}
	
	
}
