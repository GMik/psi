package entities.general;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import entities.designations.PowierzeniaProwadzacego;

@Entity
public class ProwadzacyZajecia extends Uzytkownik {

	@ManyToMany
	private ArrayList<Przedmiot> przedmioty = new ArrayList<Przedmiot>();

	@OneToMany
	private ArrayList<PowierzeniaProwadzacego> powierzeniaProwadzacego = new ArrayList<PowierzeniaProwadzacego>();
}
