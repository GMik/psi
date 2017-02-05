package com.neweducation.data.persistence.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class GenericDaoImpl<T> implements GenericDao<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	private Class<T> type;

	@Override
	public T create(T t) {
		this.entityManager.persist(t);
		return t;
	}

	@Override
	public T find(long id) {
		return (T) this.entityManager.find(type, id);
	}

	@Override
	public T update(T t) {
		return this.entityManager.merge(t);
	}

	@Override
	public void delete(long id) {
		this.entityManager.remove(this.entityManager.getReference(type, id));
	}

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

}
