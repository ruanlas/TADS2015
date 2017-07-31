package dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import database.JPAUtil;
import models.Operacao;

public class OperacaoDAO {
	private EntityManager manager;
	
	public OperacaoDAO() {
		this.manager = JPAUtil.gerEntityManager();
	}
	@Override
	protected void finalize() throws Throwable {
		this.manager.close();
	}
	public void insert(Operacao operacao) {
		this.manager.getTransaction().begin();
		this.manager.persist(operacao);
		this.manager.getTransaction().commit();
	}
	public void update(Operacao operacao) {
		this.manager.getTransaction().begin();
		this.manager.merge(operacao);
		this.manager.getTransaction().commit();
	}
	public void delete(Operacao operacao) {
		this.manager.getTransaction().begin();
		operacao = this.manager.find(Operacao.class, operacao.getId());
		this.manager.remove(operacao);
		this.manager.getTransaction().commit();
	}
	public List<Operacao> findAll() {
		Query query = this.manager.createQuery("select o from Operacao o");
		List<Operacao> list = query.getResultList();
		return list;
	}
	public List<Operacao> findAllByMonth(LocalDate date) {//tratar na própria aplicação
		List<Operacao> list = null;
		
		for (Operacao operacao : this.findAll()) {
			if (operacao.getDataOperacao().getMonth() == date.getMonth()) {
				list.add(operacao);
			}
		}
		return list;
	}
}
