package persistance.daos;

import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;

import dtos.UserTo;
import entities.designations.PowierzeniaWSemestrze;
import entities.general.Uzytkownik;

public class PowierzeniaWSemestrzeDao extends GenericDaoImpl<PowierzeniaWSemestrze> {

	public List<PowierzeniaWSemestrze> getAllDesignationsInSemesterManagedBy(UserTo userTo) {
		Uzytkownik uzytkownik = DozerBeanMapperSingletonWrapper.getInstance().map(userTo, Uzytkownik.class);
		return this.entityManager.createNamedQuery("PowierzeniaWSemestrze.getAllDesignationsInSemesterManagedBy")
				.setParameter("userId", uzytkownik.getId()).getResultList();
	}

}
