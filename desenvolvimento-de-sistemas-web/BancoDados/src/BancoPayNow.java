import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BancoPayNow {

	public static void main(String[] args) throws SQLException {
		Pagador meuPagador = new Pagador(1,"Ruan Luiz Alves da Silva", "543.654.756.098-56", "5343545333");
		Pagador meuPagador2 = new Pagador(2,"Jo�o da Silva Tavares", "529.697.008.008-51", "1276548733");
		
		Connection conn = DriverManager
				.getConnection("jdbc:hsqldb:mem:banco-em-memoria", "", "");

		PreparedStatement createTable = conn.prepareStatement("CREATE TABLE Teste(id int, nome varchar(50), cpf varchar(50), rg varchar(50))");
		createTable.executeUpdate();
		createTable.close();

		PreparedStatement insert = conn.prepareStatement("INSERT INTO Teste VALUES (?, ?, ?, ?), (?, ?, ?, ?)");
		insert.setInt(1, meuPagador.getId());
		insert.setString(2, meuPagador.getNome());
		insert.setString(3, meuPagador.getCpf());
		insert.setString(4, meuPagador.getRg());
		
		insert.setInt(5, meuPagador2.getId());
		insert.setString(6, meuPagador2.getNome());
		insert.setString(7, meuPagador2.getCpf());
		insert.setString(8, meuPagador2.getRg());
		insert.executeUpdate();
		insert.close();

		ResultSet resultado = conn.prepareStatement("SELECT * FROM Teste").executeQuery();

		ArrayList<Pagador> listaPagadores = new ArrayList<>();
		
		while (resultado.next()) {
			
//			System.out.println(resultado.getInt("id")+ " "+ resultado.getString("nome")+ " "+ resultado.getString("cpf")+ " "+ resultado.getString("rg"));
			listaPagadores.add(new Pagador(resultado.getInt("id"),  resultado.getString("nome"), resultado.getString("cpf"), resultado.getString("rg")));
		}
		
		System.out.println(listaPagadores);

		resultado.close();

		conn.close();
	}

}