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

import entities.general.Powierzenie;
import entities.general.ProwadzacyZajecia;
import entities.general.Semestr;

@Entity
public class PowierzeniaProwadzacego {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String limitGodzin;

	@Column
	private String przydzieloneGodziny;

	@ManyToOne
	private ProwadzacyZajecia prowadzacyZajecia;

	@OneToMany
	private List<Powierzenie> powierzenia = new ArrayList<Powierzenie>();

	@OneToOne
	private Semestr semestr;
}