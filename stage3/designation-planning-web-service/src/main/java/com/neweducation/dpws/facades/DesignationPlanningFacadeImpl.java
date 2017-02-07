package com.neweducation.dpws.facades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neweducation.dpws.service.DesignationService;

import dtos.CourseTo;
import dtos.DesignationTo;
import dtos.LecturerTo;
import dtos.UserTo;

public class DesignationPlanningFacadeImpl implements DesignationPlanningFacade {

	@Autowired
	private DesignationService designationService;

	@Override
	public List<CourseTo> getCoursesForDesignationsInSemester(int designationId) {
		return designationService.getCoursesForDesignationsInSemester(designationId);
	}

	@Override
	public void notifyLecturersOfDesignations(int disId) {
		designationService.notifyLecturersOfDesignations(disId);
	}

	@Override
	public List<DesignationTo> getAllDesignationsInSemesterManagedBy(UserTo user) {
		return designationService.getAllDesignationsInSemesterManagedBy(user);
	}

	@Override
	public List<LecturerTo> getLecturers(String courseId) {
		return designationService.getLecturers(courseId);
	}

	@Override
	public List<DesignationTo> getDesignations(String courseId) {
		return designationService.getDesignations(courseId);
	}

	@Override
	public void updateDesignationsForCourse(String courseId, List<DesignationTo> designations) {
		designationService.updateDesignationsForCourse(courseId, designations);
	}

	public DesignationService getDesignationService() {
		return designationService;
	}

	public void setDesignationService(DesignationService designationService) {
		this.designationService = designationService;
	}

	@Override
	public CourseTo tempzzzgetCourseById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public List<DesignationsInSemesterTo>
	// getAllDesignationsInSemesterManagedBy(int userId, String token) {
	// return
	// this.designationService.getAllDesignationsInSemesterManagedBy(userId,
	// token);
	// }

}
