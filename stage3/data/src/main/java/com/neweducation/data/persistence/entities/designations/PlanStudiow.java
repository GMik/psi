package com.neweducation.data.persistence.entities.designations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.neweducation.data.persistence.entities.general.Kierunek;
import com.neweducation.data.persistence.entities.general.Przedmiot;
import com.neweducation.data.persistence.entities.general.Student;

@Entity
public class PlanStudiow {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String cyklNauczania;

	@ManyToMany
	private List<Przedmiot> przedmioty = new ArrayList<Przedmiot>();

	@ManyToOne
	private Kierunek kierunek;

	@ManyToMany
	private List<Student> studenci = new ArrayList<Student>();
}