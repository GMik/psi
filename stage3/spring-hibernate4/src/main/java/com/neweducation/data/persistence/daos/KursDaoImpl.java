package com.neweducation.data.persistence.daos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neweducation.data.persistence.entities.general.Kurs;

@Repository
public class KursDaoImpl extends GenericDaoImpl<Kurs> implements KursDao {

	public KursDaoImpl() {
		super();
	}

	public List<Kurs> getCoursesForDesignationsInSemester(List<Integer> designationsIds) {
		return this.entityManager.createNamedQuery("Kurs.findCoursesForDesignationsInSemester")
				.setParameter("designationsIds", designationsIds).getResultList();
	}
}
