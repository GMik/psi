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

import entities.designations.PlanStudiow;
import entities.designations.PowierzeniaWSemestrze;
import entities.survey.RodzajStudiow;

@Entity
public class Kierunek {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String nazwa;

	@Column
	private String stopien;

	@OneToMany
	private ArrayList<Specjalnosc> specjalnosci = new ArrayList<Specjalnosc>();

	@ManyToOne
	private PelnomocnikDziekanaDsKierunku pelnomocnikDziekanaDsKierunku;

	@OneToOne
	private SekretarzKierunkuStudiow sekretarzKierunkuStudiow;

	@ManyToOne
	private Wydzial wydzial;

	@OneToMany
	private ArrayList<PlanStudiow> planyStudiows = new ArrayList<PlanStudiow>();

	@Enumerated
	private RodzajStudiow rodzajStudiow;

	@OneToMany
	private ArrayList<PowierzeniaWSemestrze> powierzeniaWSemestrze = new ArrayList<PowierzeniaWSemestrze>();
}