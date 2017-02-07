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

	@OneToMany
	private List<Zapotrzebowanie> zapotrzebowanie = new ArrayList<Zapotrzebowanie>();

	@Enumerated
	private FormaKursu formaKursu;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getLiczbaGodzin() {
		return liczbaGodzin;
	}

	public void setLiczbaGodzin(int liczbaGodzin) {
		this.liczbaGodzin = liczbaGodzin;
	}

	public Przedmiot getPrzedmiot() {
		return przedmiot;
	}

	public void setPrzedmiot(Przedmiot przedmiot) {
		this.przedmiot = przedmiot;
	}

	public List<Powierzenie> getPowierzenia() {
		return powierzenia;
	}

	public void setPowierzenia(List<Powierzenie> powierzenia) {
		this.powierzenia = powierzenia;
	}

	public Zapotrzebowanie getZapotrzebowanie() {
		return zapotrzebowanie;
	}

	public void setZapotrzebowanie(Zapotrzebowanie zapotrzebowanie) {
		this.zapotrzebowanie = zapotrzebowanie;
	}

	public FormaKursu getFormaKursu() {
		return formaKursu;
	}

	public void setFormaKursu(FormaKursu formaKursu) {
		this.formaKursu = formaKursu;
	}

}