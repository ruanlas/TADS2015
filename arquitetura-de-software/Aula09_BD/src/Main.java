import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
//		FabricaDeConexao fabrica = new FabricaDeConexao();
//		fabrica.getConexaoMySQL();
		
		UsuarioBD usuarioBd = new UsuarioBD();
		Usuario usuario = new Usuario();
		usuario.setNome("Amanda Lourenço");
		usuario.setSenha("123456");
		usuarioBd.addUsuario(usuario);
		
		System.out.println(usuarioBd.getUsuarios());
	}
}
