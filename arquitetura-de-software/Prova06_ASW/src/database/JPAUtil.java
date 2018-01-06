package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("prova06");
		
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}

