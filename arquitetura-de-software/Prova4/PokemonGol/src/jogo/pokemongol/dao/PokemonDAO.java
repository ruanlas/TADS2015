package jogo.pokemongol.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jogo.pokemongol.db.ConnectionFactory;
import jogo.pokemongol.models.Pokemon;
import jogo.pokemongol.models.Treinador;

public class PokemonDAO {
	private Connection conn = null;
	
	public PokemonDAO() {
		this.conn = ConnectionFactory.getConnection();
	}
	
	public void insertPokemon(Pokemon pokemon) {
		String sql = "INSERT INTO pokemon(nome, xp) VALUES ( ?, ?)";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, pokemon.getNome());
			prepareStatement.setInt(2, pokemon.getXp());
			
			prepareStatement.executeUpdate();
			
			prepareStatement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void updatePokemon(Pokemon pokemon) {
		String sql = "UPDATE pokemon SET nome = ?, xp = ? WHERE id = ?";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, pokemon.getNome());
			prepareStatement.setInt(2, pokemon.getXp());
			prepareStatement.setLong(3, pokemon.getId());
			
			prepareStatement.executeUpdate();
			
			prepareStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addTreinadorPokemon(Pokemon pokemon) {
		String sql = "UPDATE pokemon SET treinador_id = ? WHERE id = ?";
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setLong(1, pokemon.getTreinador_id());
			prepareStatement.setLong(2, pokemon.getId());
			
			prepareStatement.executeUpdate();
			
			prepareStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletePokemon(Pokemon pokemon) {
		String sql = "DELETE FROM pokemon WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setLong(1, pokemon.getId());
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Pokemon> listAll() {
		ArrayList<Pokemon> listPokemon = new ArrayList<Pokemon>();
		String sql = "SELECT * FROM pokemon";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				long id = resultSet.getLong("id");
				String nome = resultSet.getString("nome");
				int xp = resultSet.getInt("xp");
				long treinador_id = resultSet.getLong("treinador_id");
				Pokemon pokemon = new Pokemon(id, nome, xp, treinador_id);
				listPokemon.add(pokemon);
				
			}
			
			resultSet.close();
			
			preparedStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listPokemon;
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.conn.close();
	}
}
