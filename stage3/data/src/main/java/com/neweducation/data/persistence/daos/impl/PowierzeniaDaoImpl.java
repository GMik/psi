package com.neweducation.data.persistence.daos.impl;

import com.neweducation.data.persistence.daos.PowierzeniaDao;
import com.neweducation.data.persistence.daos.generics.AbstractHibernateDao;
import com.neweducation.data.persistence.entities.designations.StatusPowierzenia;
import com.neweducation.data.persistence.entities.general.Powierzenie;

import java.util.Date;

/**
 * Created by Maciej Wolański
 * maciekwski@gmail.com
 * on 08.02.2017.
 */
public class PowierzeniaDaoImpl extends AbstractHibernateDao<Powierzenie> implements PowierzeniaDao {
    @Override
    public void updateDesignationStatus(int designationId, StatusPowierzenia status) {
        Powierzenie pow = this.find(designationId);
        pow.setStatusPowierzenia(status);
        if(status == StatusPowierzenia.Zaakceptowane){
            pow.setDataAkceptacji(new Date().toString()); //TODO: Formatter
        }
    }
}
