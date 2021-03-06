package core.model;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neweducation.data.persistence.daos.KursDao;
import com.neweducation.data.persistence.entities.general.Kurs;

import dtos.CourseTo;
import utils.DozerBeanCollectionMapper;

public class CoursesModel {

	@Autowired
	private KursDao kursDao;

	public List<CourseTo> getCoursesForDesignationInSemester(int designationId) {
		return getCoursesForDesignationsInSemester(Collections.singletonList(designationId));
	}

	public List<CourseTo> getCoursesForDesignationsInSemester(List<Integer> designationsIds) {
		List<Kurs> courses = kursDao.getCoursesForDesignationsInSemester(designationsIds);
		return DozerBeanCollectionMapper.map(courses, CourseTo.class);
	}

}
