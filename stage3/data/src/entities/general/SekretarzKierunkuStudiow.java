package entities.general;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class SekretarzKierunkuStudiow extends Uzytkownik {

	@OneToMany
	private ArrayList<Kierunek> kierunki = new ArrayList<Kierunek>();
}