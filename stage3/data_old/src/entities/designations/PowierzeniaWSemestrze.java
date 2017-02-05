package entities.designations;

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

import entities.general.Kierunek;
import entities.general.PelnomocnikDziekanaDsKierunku;
import entities.general.Powierzenie;
import entities.general.Semestr;

@Entity
@NamedQuery(name = "PowierzeniaWSemestrze.getAllDesignationsInSemesterManagedBy", query = "SELECT pws FROM PowierzeniaWSemestrze pws WHERE pws.pelnomocnikDziekanaDsKierunku = (:designationsIds)")
public class PowierzeniaWSemestrze {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String dataPrzeslania;

	@Column
	private String dataAkceptacji;

	@Column
	private String dataUtworzenia;

	@Column
	private String postepAkceptacji;

	@ManyToOne
	private PelnomocnikDziekanaDsKierunku pelnomocnikDziekanaDsKierunku;

	@ManyToOne
	private Kierunek kierunek;

	@Enumerated
	private StatusPowierzenWSemestrze statusPowierzenWSemestrze;

	@OneToMany
	private List<Powierzenie> powierzenia = new ArrayList<Powierzenie>();

	@ManyToOne
	private Semestr semestr;
}