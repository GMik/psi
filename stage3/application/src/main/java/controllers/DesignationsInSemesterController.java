package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dtos.CourseTo;

@RestController
public class DesignationsInSemesterController extends AbstractController {

	@RequestMapping(value = "/designationsinsemester/{designationId}", method = RequestMethod.GET)
	public List<CourseTo> getCoursesForDesignationsInSemester(
			@RequestParam(value = "designationId") int designationId) {

		return designationPlanningFacade.getCoursesForDesignationsInSemester(designationId);
	}

}
