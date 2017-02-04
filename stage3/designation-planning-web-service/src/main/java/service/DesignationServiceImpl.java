package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import core.model.CoursesModel;
import core.model.DesignationsInSemesterModel;
import core.model.DesignationsModel;
import core.model.LecturersModel;
import dtos.CourseTo;
import dtos.DesignationTo;
import dtos.LecturerTo;
import dtos.UserTo;

public class DesignationServiceImpl implements DesignationService {

	@Autowired
	private CoursesModel coursesModel;

	@Autowired
	private DesignationsInSemesterModel designationsInSemesterModel;

	@Autowired
	private DesignationsModel designationsModel;

	@Autowired
	private LecturersModel lecturersModel;

	@Autowired
	private DesignaitonsMailingService designaitonsMailingService;

	// int or list of integers
	// ?????????????????????????????????????????????????????????????????????????????
	// (id vs ids)
	@Override
	public List<CourseTo> getCoursesForDesignationsInSemester(int designationId) {
		return coursesModel.getCoursesForDesignationInSemester(designationId);
	}

	// TO-DO
	@Override
	public void notifyLecturersOfDesignations(int designationId) {
		designaitonsMailingService.notifyLecturersOfDesignations(designationId);
	}

	@Override
	public List<DesignationTo> getAllDesignationsInSemesterManagedBy(UserTo user) {
		return designationsInSemesterModel.getAllDesignationsInSemesterManagedBy(user);
	}

	@Override
	public List<LecturerTo> getLecturers(String courseId) {
		return lecturersModel.getLecturers();
	}

	@Override
	public List<DesignationTo> getDesignations(String courseId) {
		return designationsModel.getDesignations();
	}

	@Override
	public void updateDesignationsForCourse(String courseId, List<DesignationTo> designations) {
		designationsModel.updateDesignationsForCourse(courseId, designations);
	}

}
