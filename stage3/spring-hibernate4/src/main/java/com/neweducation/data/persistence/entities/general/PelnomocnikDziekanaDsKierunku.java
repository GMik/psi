package com.neweducation.data.persistence.entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.neweducation.data.persistence.entities.designations.PowierzeniaWSemestrze;

@Entity
public class PelnomocnikDziekanaDsKierunku extends Uzytkownik {

	@OneToMany
	private List<Kierunek> kierunki = new ArrayList<Kierunek>();

	@OneToMany
	private List<PowierzeniaWSemestrze> powierzeniaWSemestrze = new ArrayList<PowierzeniaWSemestrze>();

}