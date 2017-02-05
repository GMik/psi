package com.neweducation.data.persistence.entities.general;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.neweducation.data.persistence.entities.designations.PowierzeniaProwadzacego;
import com.neweducation.data.persistence.entities.designations.PowierzeniaWSemestrze;
import com.neweducation.data.persistence.entities.designations.StatusPowierzenia;
import com.neweducation.data.persistence.entities.designations.Zapotrzebowanie;

@Entity
public class Powierzenie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String liczbaGodzin;

	@Column
	private String dataUtworzenia;

	@Column
	private String dataAkceptacji;

	@Column
	private String dataEdycji;

	@Enumerated
	private StatusPowierzenia statusPowierzenia;

	@ManyToOne
	private Zapotrzebowanie zapotrzebowanie;

	@ManyToOne
	private PowierzeniaWSemestrze powierzeniaWSemestrze;

	@ManyToOne
	private Kurs kurs;

	@ManyToOne
	private PowierzeniaProwadzacego powierzeniaProwadzacego;

	// tego chyba nie ma
	// private PelnomocnikDziekanaDsKierunku pelnomocnikDziekanaDsKierunku2;
	// private ProwadzacyZajecia prowadzacyZajecia;
	// private PelnomocnikDziekanaDsKierunku pelnomocnikDziekanaDsKierunku;
	// private SekretarzKierunkuStudiow sekretarzKierunkuStudiow;
	// private Semestr semestr;

}