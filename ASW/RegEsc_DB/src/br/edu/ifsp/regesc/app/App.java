package br.edu.ifsp.regesc.app;
import java.sql.Connection;
import java.util.ArrayList;

import be.edu.ifsp.regesc.models.Curso;
import be.edu.ifsp.regesc.models.Student;
import br.edu.ifsp.regesc.dao.StudentDAO;
import br.edu.ifsp.regesc.db.ConnectionFactory;

public class App {
	public static void main(String[] args) {
		/////começo da aula
		
////		Connection conn = ConnectionFactory.getConnection();
////		System.out.println("Deu bom!");
////		
////		System.out.println("Testando");
////		Student student = new Student("Alex Floriano", 22);
////		System.out.println(student);
//		
////		Student student = new Student("Tiririca Abestado", 50);
////		System.out.println(student);
//		
//		Student student = new Student("Marcos Pedro", 23);
//		System.out.println(student);
//		
//		StudentDAO dao = new StudentDAO();
//		//DAO = OBJETO DE ACESSO A DADOS (Data Access Object)
//		
//		dao.inser(student);
//		System.out.println(student);
//		
//		System.out.println("Deu bom");
		
		//segunda parte da aula
		StudentDAO dao = new StudentDAO();
		ArrayList<Student> studentList = dao.findAll();
		
		System.out.println("****************************");
		
		for (Student student : studentList) {
			System.out.println("-------------");
			System.out.println(student);
			System.out.println("-------------");
		}
		
		System.out.println("****************************");
		
		//Inserção de aluno no curso
		Curso curso = new Curso("TADS", "Analise de Sistemas", "Bacharelado");
		
		for (Student student : studentList) {
			curso.addAluno(student);
		}
		for (Student student : studentList) {
			curso.addAluno(student);
		}
		
		
	}
}
