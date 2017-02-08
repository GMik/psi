package com.neweducation.data.facade;

import java.util.List;

import com.neweducation.data.persistence.entities.general.Sondaz;
import com.neweducation.data.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.neweducation.data.persistence.entities.general.Kurs;

@Component
public class DataFacadeImpl implements DataFacade {

	@Autowired
	@Qualifier("kursService")
	private KursService kursService;

	@Autowired
	@Qualifier("powierzeniaWSemestrzeService")
	private PowierzeniaWSemestrzeService powierzeniaWSemestrzeService;

	@Autowired
	@Qualifier("powierzenieService")
	private PowierzenieService powierzenieService;

	@Autowired
	@Qualifier("kierunekService")
	private KierunekService kierunekService;

	@Autowired
	@Qualifier("kierunekService")
	private SondazService sondazService;

	@Override
	public List<Kurs> getCoursesForDesignationsInSemester(List<Integer> designationsIds) {
		return kursService.getCoursesForDesignationsInSemester(designationsIds);
	}

	@Override
	public Kurs find(long id) {
		return kursService.find(id);
	}

	@Override
	public List<Kurs> getCoursesFor(long semesterId, long facultyId, long fieldOfStudyId) {
		return kierunekService.getCoursesFor(semesterId, facultyId, fieldOfStudyId);
	}

	@Override
	public void discardDesignation(int designationId) {
		powierzenieService.discardDesignation(designationId);
	}

	@Override
	public void acceptDesignation(int designationId) {
		powierzenieService.acceptDesignation(designationId);
	}

	@Override
	public List<Sondaz> getSurveys(String authToken) {
		return sondazService.getSondaz(authToken);
	}

	// @Override
	// public List getAllDesignationsInSemesterManagedBy(int userId, String
	// token) {
	// return
	// powierzeniaWSemestrzeService.getAllDesignationsInSemesterManagedBy(userId,
	// token);
	//
	// }

}
