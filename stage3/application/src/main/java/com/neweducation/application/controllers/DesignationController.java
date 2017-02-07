package com.neweducation.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignationController extends AbstractController {

	@RequestMapping(value = "/designation/{designationId}", method = RequestMethod.POST)
	public void notifyLecturersOfDesignations(@RequestParam(value = "designationId") int designationId) {
		this.designationPlanningFacade.notifyLecturersOfDesignations(designationId);
	}

	// TODO
	// (1) input - (id kursu, semestr)

	// (2) input - (id kursu, id powierzenia, id prowadzacego, liczba
	// godzin(Powierzenie.class)

}
