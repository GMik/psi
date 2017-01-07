package entities.general;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import entities.designations.PowierzeniaWSemestrze;

@Entity
public class PelnomocnikDziekanaDsKierunku extends Uzytkownik {

	@OneToMany
	private ArrayList<Kierunek> kierunki = new ArrayList<Kierunek>();

	@OneToMany
	private ArrayList<PowierzeniaWSemestrze> powierzeniaWSemestrze = new ArrayList<PowierzeniaWSemestrze>();

}