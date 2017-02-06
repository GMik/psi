package com.neweducation.dpws.facades;

import java.util.List;

import dtos.CourseTo;
import dtos.DesignationTo;
import dtos.LecturerTo;
import dtos.UserTo;

public interface DesignationPlanningFacade {

	List<CourseTo> getCoursesForDesignationsInSemester(int designationId);

	void notifyLecturersOfDesignations(int disId);

	List<DesignationTo> getAllDesignationsInSemesterManagedBy(UserTo user);

	List<LecturerTo> getLecturers(String courseId);

	List<DesignationTo> getDesignations(String courseId);

	void updateDesignationsForCourse(String courseId, List<DesignationTo> designations);
}
