package entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import entities.designations.PlanStudiow;

@Entity
public class Przedmiot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String nazwa;

	@OneToMany
	private List<KartaPrzedmiotu> kartyPrzedmiotu = new ArrayList<KartaPrzedmiotu>();

	@ManyToMany
	private List<PlanStudiow> planyStudiow = new ArrayList<PlanStudiow>();

	@OneToMany
	private List<Kurs> kursy = new ArrayList<Kurs>();

	@ManyToMany
	private ArrayList<ProwadzacyZajecia> prowadzacyZajecia = new ArrayList<ProwadzacyZajecia>();

}