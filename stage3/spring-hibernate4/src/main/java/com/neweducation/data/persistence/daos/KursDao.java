package com.neweducation.data.persistence.daos;

import java.util.List;

import com.neweducation.data.persistence.entities.general.Kurs;

public class KursDao extends GenericDaoImpl<Kurs> {

	public List<Kurs> getCoursesForDesignationsInSemester(List<Integer> designationsIds) {
		return this.entityManager.createNamedQuery("Kurs.findCoursesForDesignationsInSemester")
				.setParameter("designationsIds", designationsIds).getResultList();
	}

}
