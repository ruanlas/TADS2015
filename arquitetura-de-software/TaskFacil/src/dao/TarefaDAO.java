package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import database.JPAUtil;
import models.Tarefa;

public class TarefaDAO {
	private EntityManager manager;
	
	public TarefaDAO() {
		this.manager = JPAUtil.getEntityManager();
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.manager.close();
	}
	
	public void insert(Tarefa tarefa) {
		this.manager.getTransaction().begin();
		this.manager.persist(tarefa);
		this.manager.getTransaction().commit();
	}
	public void update(Tarefa tarefa) {
		this.manager.getTransaction().begin();
		this.manager.merge(tarefa);
		this.manager.getTransaction().commit();
	}
	public void delete(Tarefa tarefa) {
		this.manager.getTransaction().begin();
		tarefa = this.manager.find(Tarefa.class, tarefa.getId());
		this.manager.remove(tarefa);
		this.manager.getTransaction().commit();
	}
	public List<Tarefa> all() {
		Query query = this.manager.createQuery("select t from Tarefa t");
		List<Tarefa> list = query.getResultList();
		return list;
	}
}
