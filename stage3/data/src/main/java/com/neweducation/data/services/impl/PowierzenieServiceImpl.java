package com.neweducation.data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.neweducation.data.persistence.daos.PowierzenieDao;
import com.neweducation.data.persistence.daos.generics.IOperations;
import com.neweducation.data.persistence.entities.designations.StatusPowierzenia;
import com.neweducation.data.persistence.entities.general.Powierzenie;
import com.neweducation.data.services.AbstractHibernateService;
import com.neweducation.data.services.PowierzenieService;

/**
 * Created by Maciej Wolański maciekwski@gmail.com on 08.02.2017.
 */
@Service
public class PowierzenieServiceImpl extends AbstractHibernateService<Powierzenie> implements PowierzenieService {

	@Autowired
	@Qualifier("powierzenieDao")
	private PowierzenieDao dao;

	@Override
	public void discardDesignation(int designationId) {
		dao.updateDesignationStatus(designationId, StatusPowierzenia.Niezaakceptowane);
	}

	@Override
	public void acceptDesignation(int designationId) {
		dao.updateDesignationStatus(designationId, StatusPowierzenia.Zaakceptowane);
	}

	@Override
	protected IOperations<Powierzenie> getDao() {
		return dao;
	}
}
