package com.neweducation.data.persistence.daos;

import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;

import com.neweducation.data.persistence.entities.designations.PowierzeniaWSemestrze;
import com.neweducation.data.persistence.entities.general.Uzytkownik;

import dtos.UserTo;

public class PowierzeniaWSemestrzeDao extends GenericDaoImpl<PowierzeniaWSemestrze> {

	public List<PowierzeniaWSemestrze> getAllDesignationsInSemesterManagedBy(UserTo userTo) {
		Uzytkownik uzytkownik = DozerBeanMapperSingletonWrapper.getInstance().map(userTo, Uzytkownik.class);
		return this.entityManager.createNamedQuery("PowierzeniaWSemestrze.getAllDesignationsInSemesterManagedBy")
				.setParameter("userId", uzytkownik.getId()).getResultList();
	}

}
