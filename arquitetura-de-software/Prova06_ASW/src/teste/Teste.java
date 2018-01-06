package teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import dao.TelefoneDAO;
import dao.UsuarioDAO;
import models.Telefone;
import models.Usuario;

public class Teste {
	@Test
	public void testeTelefone() {
		//Este teste verifica se o sistema aceita cadastrar um telefone com dígitos diferentes de 9
		TelefoneDAO dao = new TelefoneDAO();
		Telefone telefone = new Telefone();
		telefone.setNumero("12345");
		Telefone telefone2 = new Telefone();
		telefone2.setNumero("123456789");
		dao.insert(telefone);
		dao.insert(telefone2);
		
		assertEquals(1, dao.all().size());
	}
	@Test
	public void testeUsuario() {
		//Este teste verifica se o sistema aceita cadastrar usuários com mesmo email
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario1 = new Usuario();
		usuario1.setEmail("ruan@ruan");
		Usuario usuario2 = new Usuario();
		usuario2.setEmail("ruan@ruan");
		dao.insert(usuario1);
		dao.insert(usuario2);
		
		assertEquals(1, dao.all().size());
	}
	@Test
	public void testaTelefoneUsuario() {
		//este teste verifica se o sistema aceita o cadastro de telefones duplicados para um usuário
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = new Usuario();
		usuario.setEmail("joaozinho@gmail");
		Telefone telefone1 = new Telefone();
		telefone1.setNumero("987654321");
		Telefone telefone2 = new Telefone();
		telefone2.setNumero("987654321");
		usuario.addTelefones(telefone1);
		usuario.addTelefones(telefone2);
		dao.insert(usuario);
		Usuario user = null;
		for (Usuario u : dao.all()) {
			if (u.equals(usuario)) {
				user = u;
			}
		}
		
		assertEquals(1, user.getTelefones().size());
	}
	@Test
	public void testaNumeroTelefones() {
		//este teste verifica se o sistema aceita mais que 3 telefones por usuario
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = new Usuario();
		usuario.setEmail("mariazinha@gmail");
		Telefone telefone1 = new Telefone();
		telefone1.setNumero("987654321");
		Telefone telefone2 = new Telefone();
		telefone2.setNumero("123456789");
		Telefone telefone3 = new Telefone();
		telefone2.setNumero("923456781");
		Telefone telefone4 = new Telefone();
		telefone2.setNumero("187654329");
		usuario.addTelefones(telefone1);
		usuario.addTelefones(telefone2);
		usuario.addTelefones(telefone3);
		usuario.addTelefones(telefone4);
		dao.insert(usuario);
		Usuario user = null;
		for (Usuario u : dao.all()) {
			if (u.equals(usuario)) {
				user = u;
			}
		}
		
		assertEquals(3, user.getTelefones().size());
	}
}
