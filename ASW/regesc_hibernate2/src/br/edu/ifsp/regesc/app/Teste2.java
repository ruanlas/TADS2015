package br.edu.ifsp.regesc.app;

import javax.persistence.EntityManager;

import br.edu.ifsp.regesc.db.JPAUtil;
import br.edu.ifsp.regesc.models.Curso;

public class Teste2 {
	public static void main(String[] args) {
		Curso curso = new Curso();
//		curso.setNome("TADS");
		curso.setNome("TAS");
		
		EntityManager manager = JPAUtil.getEntityManager(); // Estado do objeto = Transient
		manager.getTransaction().begin(); // Estado do objeto = Transient
		manager.persist(curso); // Estado do objeto = Managed
		manager.getTransaction().commit();
		manager.close(); // Estado do objeto = Detached
	}
}
