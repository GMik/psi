package com.neweducation.application.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dtos.DesignationTo;
import dtos.UserTo;

@RestController
public class UserController extends AbstractController {

	@RequestMapping(value = "/users/{user}", method = RequestMethod.GET)
	public List<DesignationTo> getAllDesignationsInSemesterManagedBy(@RequestParam(value = "user") UserTo user) {

		return designationPlanningFacade.getAllDesignationsInSemesterManagedBy(user);
	}

}
