package entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import entities.designations.PowierzeniaProwadzacego;

@Entity
public class ProwadzacyZajecia extends Uzytkownik {

	@ManyToMany
	private List<Przedmiot> przedmioty = new ArrayList<Przedmiot>();

	@OneToMany
	private List<PowierzeniaProwadzacego> powierzeniaProwadzacego = new ArrayList<PowierzeniaProwadzacego>();
}
