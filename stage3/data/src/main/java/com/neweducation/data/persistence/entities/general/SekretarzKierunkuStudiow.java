package com.neweducation.data.persistence.entities.general;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class SekretarzKierunkuStudiow extends Uzytkownik {

	@OneToMany
	private List<Kierunek> kierunki = new ArrayList<Kierunek>();
}