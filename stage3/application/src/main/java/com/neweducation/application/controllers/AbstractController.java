package com.neweducation.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.neweducation.dpws.facades.DesignationPlanningFacade;

public class AbstractController {

	@Autowired
	protected DesignationPlanningFacade designationPlanningFacade;
}
