package com.gf;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void create(Usuario usuario) {
		entityManager.persist(usuario);
		return;
	}
	
	public void delete(Usuario usuario) {
		if(entityManager.contains(usuario)){
			entityManager.remove(usuario);
		}else {
			entityManager.remove(entityManager.merge(usuario));			
		}
		return;
	}
	
	public void update(Usuario usuario) {
		entityManager.merge(usuario);
		return;
	}
	
	public Usuario getById(String id) {
		return entityManager.find(Usuario.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getAll(){
		return entityManager.createQuery("from Usuario").getResultList();
	}
	

}
