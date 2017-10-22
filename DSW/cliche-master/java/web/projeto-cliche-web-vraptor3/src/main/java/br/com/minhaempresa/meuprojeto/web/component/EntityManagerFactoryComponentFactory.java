package br.com.minhaempresa.meuprojeto.web.component;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@ApplicationScoped
@Component
public class EntityManagerFactoryComponentFactory implements
		ComponentFactory<EntityManagerFactory> {

	private final EntityManagerFactory emf;

	public EntityManagerFactoryComponentFactory() {
		emf = Persistence.createEntityManagerFactory("hsqldb-pu");
	}

	@Override
	public EntityManagerFactory getInstance() {
		return emf;
	}

	@PreDestroy
	public void fecharEmf() {
		emf.close();
	}

}
