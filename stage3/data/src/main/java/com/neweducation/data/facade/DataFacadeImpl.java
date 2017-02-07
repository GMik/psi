package com.neweducation.data.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.neweducation.data.persistence.entities.general.Kurs;
import com.neweducation.data.services.KursService;
import com.neweducation.data.services.PowierzeniaWSemestrzeService;

@Component
public class DataFacadeImpl implements DataFacade {

	@Autowired
	@Qualifier("kursService")
	private KursService kursService;

	@Autowired
	@Qualifier("powierzeniaWSemestrzeService")
	private PowierzeniaWSemestrzeService powierzeniaWSemestrzeService;

	@Override
	public List<Kurs> getCoursesForDesignationsInSemester(List<Integer> designationsIds) {
		return kursService.getCoursesForDesignationsInSemester(designationsIds);
	}

	@Override
	public Kurs find(long id) {
		return kursService.find(id);
	}

	@Override
	public void getAllDesignationsInSemesterManagedBy(int userId, String token) {
		return powierzeniaWSemestrzeService.getAllDesignationsInSemesterManagedBy(userId, token);

	}

}
