package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import database.JPAUtil;
import models.Usuario;

public class UsuarioDAO {
	private EntityManager manager;
	
	public UsuarioDAO() {
		this.manager = JPAUtil.getEntityManager();
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.manager.close();
	}
	
	public void insert(Usuario usuario) {
		List<Usuario> usuarios = this.all();
		if (!usuarios.contains(usuario)) {
			this.manager.getTransaction().begin();
			this.manager.persist(usuario);
			this.manager.getTransaction().commit();
		}
	}
	public void update(Usuario usuario) {
		this.manager.getTransaction().begin();
		this.manager.merge(usuario);
		this.manager.getTransaction().commit();
	}
	public void delete(Usuario usuario) {
		this.manager.getTransaction().begin();
		usuario = this.manager.find(Usuario.class, usuario.getId());
		this.manager.remove(usuario);
		this.manager.getTransaction().commit();
	}
	public List<Usuario> all() {
		Query query = this.manager.createQuery("select u from Usuario u");
		List<Usuario> list = query.getResultList();
		return list;
	}
}
