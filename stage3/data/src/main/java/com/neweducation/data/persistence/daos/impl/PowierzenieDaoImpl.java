package com.neweducation.data.persistence.daos.impl;

import java.util.Date;

import com.neweducation.data.persistence.daos.PowierzenieDao;
import com.neweducation.data.persistence.daos.generics.AbstractHibernateDao;
import com.neweducation.data.persistence.entities.designations.StatusPowierzenia;
import com.neweducation.data.persistence.entities.general.Powierzenie;

/**
 * Created by Maciej Wolański maciekwski@gmail.com on 08.02.2017.
 */
public class PowierzenieDaoImpl extends AbstractHibernateDao<Powierzenie> implements PowierzenieDao {
	@Override
	public void updateDesignationStatus(int designationId, StatusPowierzenia status) {
		Powierzenie pow = this.find(designationId);
		pow.setStatusPowierzenia(status);
		if (status == StatusPowierzenia.Zaakceptowane) {
			pow.setDataAkceptacji(new Date().toString()); // TODO: Formatter
		}
	}
}
