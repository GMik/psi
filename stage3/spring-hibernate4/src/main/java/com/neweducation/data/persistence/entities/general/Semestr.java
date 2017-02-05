package com.neweducation.data.persistence.entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.neweducation.data.persistence.entities.designations.PowierzeniaProwadzacego;
import com.neweducation.data.persistence.entities.designations.PowierzeniaWSemestrze;
import com.neweducation.data.persistence.entities.designations.Zapotrzebowanie;

@Entity
public class Semestr {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String nazwa;

	@Column
	private String dataRozpoczecia;

	@Column
	private String dataZakonczenia;

	@OneToMany
	private List<Zapotrzebowanie> zapotrzebowania = new ArrayList<Zapotrzebowanie>();

	@OneToMany
	private List<PowierzeniaWSemestrze> powierzeniaWSemestrze = new ArrayList<PowierzeniaWSemestrze>();

	@OneToOne
	private PowierzeniaProwadzacego powierzeniaProwadzacego;
}