package br.edu.ifsp.regesc.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.PreparedStatement;
import java.sql.Statement;
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;

import be.edu.ifsp.regesc.models.Student;
import br.edu.ifsp.regesc.db.ConnectionFactory;

public class StudentDAO {
	private Connection conn;

	public StudentDAO() {
		this.conn = ConnectionFactory.getConnection();
	}
	@Override
	public void finalize(){ //'Destrutor' => este método sempre é chamado antes da destruição do objeto
		try {
			this.conn.close();
		} catch (SQLException e) {
			//e.printStackTrace();
			Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	public void inser(Student student) {
		String sql = "INSERT INTO Student(name, age) VALUES(?, ?)";
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, student.getName());
			stmt.setInt(2, student.getAge());
			/*stmt.setInt(3, (int)student.getId());*/
			
			//Executa o insert e retorna a chave gerada automaticamente pelo db
			stmt.executeUpdate();
			
			//temos um array com as chaves geradas, onde cada chave (resultado)
			//começa no indice 1
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			student.setId(rs.getInt(1)); //o indice [1] corresponde ao id retornado pelo db
			
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Student> findAll() {
		ArrayList<Student> list = new ArrayList<Student>();
		
		String sql = "SELECT * FROM Student";
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			
			//retorna um conjunto de resultados: um elemento por tupla/linha da tabela
			//rs começa apontando para -1
			//[[id1, name1, age1], [id2, name2, age2], .....]
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				//os indices precisam "bater" com a posição das colunas da tabela
				//1 = id, 2 = name, 3 = idade
				long id = rs.getLong(1); //id
				String name = rs.getString(2); //name
				int age = rs.getInt(3); //idade
				
				Student student = new Student(name, age);
				student.setId(id);
				
				list.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
}
