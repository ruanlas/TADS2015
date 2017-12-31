package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.FabricaConexao;
import modelos.Aluno;

public class AlunoDAO {
	private Connection conexao;
	
	public AlunoDAO() {
		conexao = FabricaConexao.getConnection();
	}
	
	public void insertAluno(Aluno aluno) {
		String sql = "INSERT INTO aluno(nome, cpf, dataNascimento, rg, ra) VALUES (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getCpf());
			stmt.setDate(3, aluno.getDataNascimento());
			stmt.setString(4, aluno.getRg());
			stmt.setString(5, aluno.getRa());
			
			stmt.executeUpdate();
			stmt.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Aluno> selectAluno() {
		List<Aluno> listaAlunos = new ArrayList<>();
		String sql = "SELECT * FROM aluno";
		
		try {
			PreparedStatement prepare = conexao.prepareStatement(sql);
			
			ResultSet rs = prepare.executeQuery();
			
			while (rs.next()) {
				long id = rs.getLong(1);
				String nome = rs.getString(2);
				String cpf = rs.getString(3);
				Date dataNascimento = rs.getDate(4);
				String rg = rs.getString(5);
				String ra = rs.getString(6);
				
				Aluno aluno = new Aluno(nome, cpf, dataNascimento, rg, ra);
				aluno.setId(id);
				
				listaAlunos.add(aluno);
			}
			rs.close();
			prepare.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return listaAlunos;
	}
	
	public void removeUsuario(long id) {
		String sql = "DELETE FROM aluno WHERE matricula = ?";
		
		try {
			PreparedStatement prepare = conexao.prepareStatement(sql);
			prepare.setLong(1, id);
			
			prepare.executeUpdate();
			
			prepare.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
