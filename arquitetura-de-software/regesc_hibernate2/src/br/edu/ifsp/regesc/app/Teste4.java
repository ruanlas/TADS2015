package br.edu.ifsp.regesc.app;


import javax.persistence.EntityManager;

import br.edu.ifsp.regesc.db.JPAUtil;
import br.edu.ifsp.regesc.models.Curso;

public class Teste4 {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		
		manager.getTransaction().begin();
		Curso curso = manager.find(Curso.class, 1);
		
		System.out.println("Tamanho :" + curso.getLista().size());
		
		manager.getTransaction().commit();
		manager.close();
		
//		System.out.println("Tamanho :" + curso.getLista().size());
	}
}
