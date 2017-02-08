package com.neweducation.data.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.neweducation.data.persistence.daos.KursDao;
import com.neweducation.data.persistence.daos.PowierzeniaWSemestrzeDao;
import com.neweducation.data.persistence.daos.PowierzenieDao;
import com.neweducation.data.persistence.daos.ProwadzacyZajeciaDao;
import com.neweducation.data.persistence.daos.ZapotrzebowanieDao;
import com.neweducation.data.persistence.daos.generics.IOperations;
import com.neweducation.data.persistence.entities.designations.PowierzeniaWSemestrze;
import com.neweducation.data.persistence.entities.designations.StatusPowierzenia;
import com.neweducation.data.persistence.entities.designations.Zapotrzebowanie;
import com.neweducation.data.persistence.entities.general.Kurs;
import com.neweducation.data.persistence.entities.general.Powierzenie;
import com.neweducation.data.persistence.entities.general.ProwadzacyZajecia;
import com.neweducation.data.services.AbstractHibernateService;
import com.neweducation.data.services.PowierzenieService;

import dtos.DesignationTo;

/**
 * Created by Maciej Wolański maciekwski@gmail.com on 08.02.2017.
 */
@Service
public class PowierzenieServiceImpl extends AbstractHibernateService<Powierzenie> implements PowierzenieService {

	@Autowired
	@Qualifier("powierzenieDao")
	private PowierzenieDao dao;

	@Autowired
	@Qualifier("kursDao")
	private KursDao kursDao;

	@Autowired
	@Qualifier("prowadzacyZajeciaDao")
	private ProwadzacyZajeciaDao prowadzacyZajeciaDao;

	@Autowired
	@Qualifier("zapotrzebowanieDao")
	private ZapotrzebowanieDao zapotrzebowanieDao;

	@Autowired
	@Qualifier("powierzeniaWSemestrzeDao")
	private PowierzeniaWSemestrzeDao powierzeniaWSemestrzeDao;

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

	@Override
	public void addNewDesignation(long courseId, long lecturerId, long numberOfHours, long requestId,
			long designationInSemesterId) {

		Powierzenie powierzenie = new Powierzenie();
		Kurs kurs = kursDao.find(courseId);
		ProwadzacyZajecia prowadzacyZajecia = prowadzacyZajeciaDao.find(lecturerId);
		Zapotrzebowanie zapotrzebowanie = zapotrzebowanieDao.find(requestId);
		PowierzeniaWSemestrze powierzeniaWSemestrze = powierzeniaWSemestrzeDao.find(designationInSemesterId);

		// others: cascade - persist/save/refresh
		powierzenie.setKurs(kurs);
		powierzenie.setProwadzacyZajecia(prowadzacyZajecia);
		powierzenie.setLiczbaGodzin((int) numberOfHours);
		powierzenie.setStatusPowierzenia(StatusPowierzenia.WPrzygotowaniu);
		powierzenie.setZapotrzebowanie(zapotrzebowanie);
		powierzenie.setPowierzeniaWSemestrze(powierzeniaWSemestrze);

		dao.create(powierzenie);

	}

	@Override
	public List<DesignationTo> getAllDesignationsOfUserInSemester(long userId, long semesterId) {
		List<DesignationTo> designationTos = new ArrayList<>();

		return designationTos;
	}
}
