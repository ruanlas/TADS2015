
package br.edu.ifsp.regesc.dao;

import br.edu.ifsp.regesc.db.ConnectionFactory;
import br.edu.ifsp.regesc.models.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentDAO {
    private Connection conn;
    
    
    public StudentDAO() {
        this.conn = ConnectionFactory.getConnection();
    }
    
    
    // este método sempr é chamado antes do objeto ser destruído
    // último suspiro de vida do objeto
    @Override
    public void finalize() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void insert(Student student) {
        String sql = "INSERT INTO Student(name, age) VALUES(?, ?)";
        
        try {
            // Nao recupera dados/atributos gerados automaticamente pelo banco
            // PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            
            // executa o insert e retorna a chave gerada automaticamente pelo db
            stmt.executeUpdate();
            
            // temos um array com as chaves geradas, onde cada chave(resultado)
            // come�a no �ndice 1
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            student.setId(rs.getInt(1)); // o indice [1] corresponde ao id retornado pelo db
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Student student) {
		String sql = "UPDATE Student SET name = ?, age = ? WHERE id = ?";
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, student.getName());
			stmt.setInt(2, student.getAge());
			stmt.setLong(3, student.getId());
			
			stmt.executeUpdate();
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
    public void delete(Student student) {
		String sql = "DELETE FROM Student WHERE id = ?";
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setLong(1, student.getId());
			
			stmt.executeUpdate();
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
    
    public ArrayList<Student> findAll() {
        ArrayList<Student> list = new ArrayList<Student>();
        
        String sql = "SELECT * FROM Student";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            // retorna um conjunto de resultados: um elemento por tupla/linha da tabela
            // rs começa apontando para -1
            // [[id1, name1, age1], [id2, name2, age2], ...]
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // os indices precisam "bater" com a posição das colunas da tabela
                // 1 = id, 2 = name, 3 = age
                long id = rs.getLong(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                
                Student student = new Student(name, age);
                student.setId(id);
                
                list.add(student);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
}



