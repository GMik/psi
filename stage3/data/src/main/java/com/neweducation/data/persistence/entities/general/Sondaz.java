package com.neweducation.data.persistence.entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.neweducation.data.persistence.entities.survey.StatusSondazu;

@Entity
public class Sondaz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String nazwa;

	@Column
	private String dataUtw;

	@Column
	private String dataRozp;

	@Column
	private String dataZak;

	@Column
	private String opis;

	@ManyToMany
	private List<Specjalnosc> specjalnosci = new ArrayList<Specjalnosc>();

	@ManyToMany
	private List<Student> studenci = new ArrayList<Student>();

	@ManyToOne
	private Semestr semestr;

	@Enumerated
	private StatusSondazu statusSondazu;

}