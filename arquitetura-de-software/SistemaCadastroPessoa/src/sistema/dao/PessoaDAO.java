package sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sistema.db.ConnectionFactory;
import sistema.models.Pessoa;

public class PessoaDAO {
	private Connection conn;

	public PessoaDAO() {
		this.conn = null;
	}
	
	public void insert(Pessoa pessoa) {
		this.conn = ConnectionFactory.getConnection();
		String sql = "INSERT INTO pessoa(nome, cpf, rg) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setLong(2, pessoa.getCpf());
			stmt.setLong(3, pessoa.getRg());
			
			stmt.executeUpdate();
			
			stmt.close();
			System.out.println("Pessoa Cadastrada!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conn = ConnectionFactory.closeConnection(conn);
			//System.out.println("Foi executado entrando ou nao na exceção");
		}
	}
	
	public void update(Pessoa pessoa) {
		this.conn = ConnectionFactory.getConnection();
		String sql = "UPDATE pessoa SET name = ?, rg = ?, cpf = ? WHERE id = ?";
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setLong(2, pessoa.getRg());
			stmt.setLong(3, pessoa.getCpf());
			stmt.setInt(4, pessoa.getId());
			
			stmt.executeUpdate();
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conn = ConnectionFactory.closeConnection(conn);
		}
	}
	
	public void delete(Pessoa pessoa) {
		this.conn = ConnectionFactory.getConnection();
		String sql = "DELETE FROM pessoa WHERE id = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, pessoa.getId());
			
			stmt.executeUpdate();
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conn = ConnectionFactory.closeConnection(conn);
		}
		
	}
	
	public ArrayList<Pessoa> findAll() {
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		this.conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM pessoa";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet resultSet = stmt.executeQuery();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				long cpf = resultSet.getLong("cpf");
				long rg = resultSet.getLong("rg");
				
				Pessoa pessoa = new Pessoa(id, nome, cpf, rg);
				listaPessoas.add(pessoa);
			}
			stmt.close();
			resultSet.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conn = ConnectionFactory.closeConnection(conn);
		}
		
		return listaPessoas;
	}
	
}
