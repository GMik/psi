package com.neweducation.dpws.core.model.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.neweducation.data.persistence.entities.general.Kurs;
import com.neweducation.dpws.core.model.AbstractModel;
import com.neweducation.dpws.core.model.CoursesModel;

import dtos.CourseTo;
import utils.DozerBeanCollectionMapper;

@Component
public class CoursesModelImpl extends AbstractModel implements CoursesModel {

	// @Autowired
	// @Qualifier("data")
	// private KursService kursService;

	public List<CourseTo> getCoursesForDesignationInSemester(int designationId) {
		return getCoursesForDesignationsInSemester(Collections.singletonList(designationId));
	}

	public List<CourseTo> getCoursesForDesignationsInSemester(List<Integer> designationsIds) {
		List<Kurs> courses = dataFacade.getCoursesForDesignationsInSemester(designationsIds);
		return DozerBeanCollectionMapper.map(courses, CourseTo.class);
	}

	public Kurs getById(long id) {
		return dataFacade.find(id);
	}

}
