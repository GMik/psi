package com.neweducation.data.persistence.daos;

import java.util.List;

import org.apache.commons.lang3.NotImplementedException;

import com.neweducation.data.persistence.daos.generics.AbstractHibernateDao;
import com.neweducation.data.persistence.entities.designations.PowierzeniaWSemestrze;

import dtos.UserTo;

public class PowierzeniaWSemestrzeDao extends AbstractHibernateDao<PowierzeniaWSemestrze> {

	public List<PowierzeniaWSemestrze> getAllDesignationsInSemesterManagedBy(UserTo userTo) {

		throw new NotImplementedException("not impl yet");
		// Uzytkownik uzytkownik =
		// DozerBeanMapperSingletonWrapper.getInstance().map(userTo,
		// Uzytkownik.class);
		// return
		// this.entityManager.createNamedQuery("PowierzeniaWSemestrze.getAllDesignationsInSemesterManagedBy")
		// .setParameter("userId", uzytkownik.getId()).getResultList();
	}

}
