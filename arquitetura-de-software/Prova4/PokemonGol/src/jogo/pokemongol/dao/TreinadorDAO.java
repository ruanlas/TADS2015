package jogo.pokemongol.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import jogo.pokemongol.db.ConnectionFactory;
import jogo.pokemongol.models.Treinador;

public class TreinadorDAO {
	private Connection conn = null;
	
	public TreinadorDAO() {
		this.conn = ConnectionFactory.getConnection();
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.conn.close();
	}
	
	public void insertTreinador(Treinador treinador) {
		String sql = "INSERT INTO treinador(nome, cidade, idade) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, treinador.getNome());
			preparedStatement.setString(2, treinador.getCidade());
			preparedStatement.setInt(3, treinador.getIdade());
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateTreinador(Treinador treinador) {
		String sql ="UPDATE treinador SET nome = ?, cidade = ?, idade = ? WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, treinador.getNome());
			preparedStatement.setString(2, treinador.getCidade());
			preparedStatement.setInt(3, treinador.getIdade());
			preparedStatement.setLong(4, treinador.getId());
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteTreinador(Treinador treinador) {
		String sql = "DELETE FROM treinador WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setLong(1, treinador.getId());
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Treinador> listAll() {
		ArrayList<Treinador> listTreinador = new ArrayList<Treinador>();
		String sql = "SELECT * FROM treinador";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				long id = resultSet.getLong("id");
				String nome = resultSet.getString("nome");
				String cidade = resultSet.getString("cidade");
				int idade = resultSet.getInt("idade");
				
				Treinador treinador = new Treinador(id, nome, cidade, idade);
				listTreinador.add(treinador);
			}
			resultSet.close();
			preparedStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listTreinador;
	}
	
}
