package sistema;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UniversidadeDAO {
	private EntityManager manager;
	
	public UniversidadeDAO() {
		this.manager = JPAUtil.getEntityManager();
	}
	
	@Override
	public void finalize() {
		this.manager.close();
	}
	
	public void insert(Universidade universidade) {
		this.manager.getTransaction().begin();
		this.manager.persist(universidade);
		this.manager.getTransaction().commit();
	}
	
	public void update(Universidade universidade) {
		this.manager.getTransaction().begin();
		this.manager.merge(universidade);
		this.manager.getTransaction().commit();
	}
	
	public void delete(Universidade universidade) {
		this.manager.getTransaction().begin();	
		universidade = this.manager.find(Universidade.class, universidade.getId());
		this.manager.remove(universidade);
		this.manager.getTransaction().commit();
	}
	
	public List<Universidade> all() {
		Query query = manager.createQuery("select s from Universidade s");
		List<Universidade> list = query.getResultList();
		return list;
	}
}
