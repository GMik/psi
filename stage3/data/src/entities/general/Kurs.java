package entities.general;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import entities.designations.FormaKursu;
import entities.designations.Zapotrzebowanie;

@Entity
public class Kurs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String nazwa;

	@Column
	private String liczbaGodzin;

	@ManyToOne
	private Przedmiot przedmiot;

	@OneToMany
	private ArrayList<Powierzenie> powierzenia = new ArrayList<Powierzenie>();

	@OneToOne
	private Zapotrzebowanie zapotrzebowanie;

	@Enumerated
	private FormaKursu formaKursu;
}