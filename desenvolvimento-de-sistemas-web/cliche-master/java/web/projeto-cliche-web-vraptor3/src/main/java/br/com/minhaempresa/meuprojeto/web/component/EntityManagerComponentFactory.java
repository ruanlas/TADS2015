package br.com.minhaempresa.meuprojeto.web.component;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.caelum.vraptor.ioc.RequestScoped;

@RequestScoped
@Component
public class EntityManagerComponentFactory implements
		ComponentFactory<EntityManager> {

	private final EntityManager em;

	public EntityManagerComponentFactory(EntityManagerFactory emf) {
		em = emf.createEntityManager();
		em.getTransaction().begin();// :)
	}

	@Override
	public EntityManager getInstance() {
		return em;
	}

	@PreDestroy
	public void fechar() {
		em.getTransaction().commit();//:)
		em.close();
	}

}
