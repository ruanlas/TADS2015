package br.edu.ifsp.regesc.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	//Qdo a classe for carregado pela JVM, este atributo Propiet�rio da classe
	//� carregado tamb�m
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("regesc2");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
