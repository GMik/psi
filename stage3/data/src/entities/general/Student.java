package entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import entities.designations.PlanStudiow;

@Entity
public class Student extends Uzytkownik {

	@ManyToMany
	private List<Sondaz> sondaze = new ArrayList<Sondaz>();

	@ManyToMany
	private ArrayList<PlanStudiow> planyStudiow = new ArrayList<PlanStudiow>();
}