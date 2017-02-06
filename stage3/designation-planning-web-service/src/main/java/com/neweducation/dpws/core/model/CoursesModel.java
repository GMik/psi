package com.neweducation.dpws.core.model;

import java.util.List;

import com.neweducation.data.persistence.entities.general.Kurs;

import dtos.CourseTo;

public interface CoursesModel {

	List<CourseTo> getCoursesForDesignationInSemester(int designationId);

	List<CourseTo> getCoursesForDesignationsInSemester(List<Integer> designationsIds);

	Kurs getById(long id);

}
