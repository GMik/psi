package com.neweducation.data.persistence.entities.survey;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.neweducation.data.persistence.entities.general.Sondaz;

@Entity
public class Wynik {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToMany
	private List<Sondaz> sondaze = new ArrayList<>();
}