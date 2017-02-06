package core.model;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.neweducation.data.persistence.entities.general.Kurs;
import com.neweducation.data.services.KursService;

import dtos.CourseTo;
import utils.DozerBeanCollectionMapper;

public class CoursesModelImpl implements CoursesModel {

	@Autowired
	@Qualifier("data")
	private KursService kursService;

	public List<CourseTo> getCoursesForDesignationInSemester(int designationId) {
		return getCoursesForDesignationsInSemester(Collections.singletonList(designationId));
	}

	public List<CourseTo> getCoursesForDesignationsInSemester(List<Integer> designationsIds) {
		List<Kurs> courses = kursService.getCoursesForDesignationsInSemester(designationsIds);
		return DozerBeanCollectionMapper.map(courses, CourseTo.class);
	}

	public Kurs getById(long id) {
		return kursService.find(id);
	}

}
