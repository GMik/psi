package entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import entities.designations.PowierzeniaWSemestrze;

@Entity
public class PelnomocnikDziekanaDsKierunku extends Uzytkownik {

	@OneToMany
	private List<Kierunek> kierunki = new ArrayList<Kierunek>();

	@OneToMany
	private List<PowierzeniaWSemestrze> powierzeniaWSemestrze = new ArrayList<PowierzeniaWSemestrze>();

}