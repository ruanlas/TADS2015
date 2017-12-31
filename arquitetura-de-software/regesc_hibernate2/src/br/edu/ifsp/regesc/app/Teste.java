package br.edu.ifsp.regesc.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifsp.regesc.models.Student;

public class Teste {
	public static void main(String[] args) {
//		Student student = new Student("Gohan", 20);
		Student student = new Student("Barbeiro", 40);
		student.setId(8L);
		
		System.out.println(student);
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("regesc2");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
////		manager.persist(student); //insert
//		
//		Student student2 = manager.find(Student.class, 2L);
//		student2.setName("Viuva Negra");
//		manager.persist(student2); //update
		manager.merge(student); //update/insert gerenciavel
		Student student2 = manager.find(Student.class, 3L);
		manager.remove(student2); //delete
		
		
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println(student);
	}
}
