package com.neweducation.data.persistence.entities.designations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.neweducation.data.persistence.entities.general.ProwadzacyZajecia;
import com.neweducation.data.persistence.entities.general.Semestr;

@Entity
public class LimityProwadzacego {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private ProwadzacyZajecia prowadzacyZajecia;

	@ManyToOne
	private Semestr semestr;

}
