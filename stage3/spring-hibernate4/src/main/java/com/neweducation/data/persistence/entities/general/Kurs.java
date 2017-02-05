package com.neweducation.data.persistence.entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.neweducation.data.persistence.entities.designations.FormaKursu;
import com.neweducation.data.persistence.entities.designations.Zapotrzebowanie;

@Entity
@NamedQuery(name = "Kurs.findCoursesForDesignationsInSemester", query = "SELECT k FROM Kurs k WHERE k.id in (:designationsIds)")
public class Kurs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String nazwa;

	@Column
	private int liczbaGodzin;

	@ManyToOne
	private Przedmiot przedmiot;

	@OneToMany
	private List<Powierzenie> powierzenia = new ArrayList<Powierzenie>();

	@OneToOne
	private Zapotrzebowanie zapotrzebowanie;

	@Enumerated
	private FormaKursu formaKursu;
}