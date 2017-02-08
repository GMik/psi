package com.neweducation.data.facade;

import java.util.List;

import com.neweducation.data.persistence.entities.general.Kurs;

public interface DataFacade {
	List<Kurs> getCoursesForDesignationsInSemester(List<Integer> designationsIds);

	Kurs find(long id);

	List<Kurs> getCoursesFor(long semesterId, long facultyId, long fieldOfStudyId);

    void discardDesignation(int designationId);

    // void getAllDesignationsInSemesterManagedBy(int userId, String token);
}
