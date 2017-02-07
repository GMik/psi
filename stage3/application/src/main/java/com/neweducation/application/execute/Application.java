package com.neweducation.application.execute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neweducation.dpws.facades.DesignationPlanningFacade;

import dtos.CourseTo;

@SpringBootApplication
public class Application {

	@Autowired
	DesignationPlanningFacade designationPlanningFacade;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		CourseTo c;

	}
}
