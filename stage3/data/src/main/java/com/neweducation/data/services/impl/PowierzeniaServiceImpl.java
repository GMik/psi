package com.neweducation.data.services.impl;

import com.neweducation.data.persistence.daos.PowierzeniaDao;
import com.neweducation.data.persistence.entities.designations.StatusPowierzenia;
import com.neweducation.data.services.PowierzeniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Maciej Wolański
 * maciekwski@gmail.com
 * on 08.02.2017.
 */
public class PowierzeniaServiceImpl implements PowierzeniaService {

    @Autowired
    @Qualifier("powierzeniaDao")
    private PowierzeniaDao dao;
    @Override
    public void discardDesignation(int designationId) {
        dao.updateDesignationStatus(designationId, StatusPowierzenia.Niezaakceptowane);
    }

    @Override
    public void acceptDesignation(int designationId) {
        dao.updateDesignationStatus(designationId, StatusPowierzenia.Zaakceptowane);
    }
}
