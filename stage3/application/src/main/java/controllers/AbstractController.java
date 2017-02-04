package controllers;

import org.springframework.beans.factory.annotation.Autowired;

import facades.DesignationPlanningFacade;

public class AbstractController {

	@Autowired
	protected DesignationPlanningFacade designationPlanningFacade;
}
