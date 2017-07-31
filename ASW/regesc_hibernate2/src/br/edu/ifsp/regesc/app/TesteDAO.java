package br.edu.ifsp.regesc.app;

import br.edu.ifsp.regesc.dao.StudentDAO;
import br.edu.ifsp.regesc.models.Student;

public class TesteDAO {
	public static void main(String[] args) {
		Student student = new Student("Bifao", 100);
		student.setId(7L);
		student.setName("Bifao Lokao");
		StudentDAO dao = new StudentDAO();
		
		//dao.update(student);
		
		for (Student student2 : dao.all()) {
			System.out.println(student2);
		}
	}
}
