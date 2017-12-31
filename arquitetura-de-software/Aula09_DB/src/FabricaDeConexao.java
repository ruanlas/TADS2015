import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricaDeConexao {
	Connection conexao = null;
	
	//metodo para realizar a conexao com o meu banco

	public Connection getConexaoMySQL() {
		
		String servidor = "localhost:3306"; //ip
		String banco = "aula_db";
		String usuario = "root";
		String senha = "";
		
		String url = "jdbc:mysql://" + servidor + "/" + banco;
		//jdbc:mysql: => chama o conector do banco
		
		try {
			System.out.println("Contrutor Criado");
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexao realizada!!!");
		} catch (SQLException e) {
			Logger.getLogger(FabricaDeConexao.class.getName()).log(Level.SEVERE, null, e);
			System.out.println(e.getMessage());
		}
		return conexao;
	}
}
