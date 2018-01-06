package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import database.JPAUtil;
import models.Telefone;
import others.TelefoneValidation;

public class TelefoneDAO {
	private EntityManager manager;
	
	public TelefoneDAO() {
		this.manager = JPAUtil.getEntityManager();
	}
	@Override
	protected void finalize() throws Throwable {
		this.manager.close();
	}
	
	public void insert(Telefone telefone) {
		if (TelefoneValidation.isTelefone(telefone.getNumero())) {
			this.manager.getTransaction().begin();
			this.manager.persist(telefone);
			this.manager.getTransaction().commit();
		}
	}
	public void update(Telefone telefone) {
		this.manager.getTransaction().begin();
		this.manager.merge(telefone);
		this.manager.getTransaction().commit();
	}
	public void delete(Telefone telefone) {
		this.manager.getTransaction().begin();
		telefone = this.manager.find(Telefone.class, telefone.getId());
		this.manager.remove(telefone);
		this.manager.getTransaction().commit();
	}
	public List<Telefone> all() {
		Query query = this.manager.createQuery("select t from Telefone t");
		List<Telefone> list = query.getResultList();
		return list;
	}
}
