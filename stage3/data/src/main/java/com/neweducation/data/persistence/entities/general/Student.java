package com.neweducation.data.persistence.entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.neweducation.data.persistence.entities.designations.PlanStudiow;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends Uzytkownik {

	@ManyToMany
	private List<Sondaz> sondaze = new ArrayList<Sondaz>();

	@ManyToMany
	private List<PlanStudiow> planyStudiow = new ArrayList<PlanStudiow>();
}