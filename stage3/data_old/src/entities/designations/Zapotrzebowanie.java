package entities.designations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import entities.general.Kurs;
import entities.general.Powierzenie;
import entities.general.Semestr;

@Entity
public class Zapotrzebowanie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String liczbaGodzin;

	@OneToMany
	private List<Powierzenie> powierzenia = new ArrayList<Powierzenie>();

	@OneToOne
	private Kurs kurs;

	@ManyToOne
	private Semestr semestr;
}