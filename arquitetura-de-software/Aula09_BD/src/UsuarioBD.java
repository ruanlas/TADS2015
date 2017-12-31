import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.PreparedStatement;

public class UsuarioBD {
	Connection conexao = FabricaDeConexao.getConexaoMySQL();
	
	//metodo para adicionar um usuário na tabela
	public void addUsuario(Usuario usuario) {
		String sql = "INSERT INTO usuario(nome, senha) VALUES (?, ?)";
		
		//conexão foi realizada
		if (conexao != null) {
			try {
				PreparedStatement prepareStatement = conexao.prepareStatement(sql);
				prepareStatement.setString(1, usuario.getNome());
				prepareStatement.setString(2, usuario.getSenha());
				
				prepareStatement.execute();
				prepareStatement.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Erro ao realizar conexão com o BD");
		}
	}
	
	//metodo para retornar a lista de usuarios cadastrados
	public List<Usuario> getUsuarios() throws SQLException {
		String sql = "SELECT * FROM usuario";
		List<Usuario> listaUsuarios = null;
		
		if(conexao != null){
			listaUsuarios = new ArrayList<>();
			PreparedStatement preparedStatement = conexao.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSenha(rs.getString("senha"));
				
				listaUsuarios.add(usuario);
			}
			preparedStatement.close();
		}
		return listaUsuarios;
	}
	
	//metodo para validar um usuario
	public Usuario getUsuario(String nome, String senha) throws SQLException {
		String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
		Usuario usuario = null;
		
		if (conexao != null) {
			PreparedStatement preparedStatement = conexao.prepareStatement(sql);
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, senha);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			//verifica se há resultado
			if (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setSenha(rs.getString(3));
			}
			preparedStatement.close();
		}
		return usuario;
	}
}
