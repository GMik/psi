package com.neweducation.data.services;

import com.neweducation.data.persistence.daos.generics.IOperations;
import com.neweducation.data.persistence.entities.general.Powierzenie;

/**
 * Created by Maciej Wolański maciekwski@gmail.com on 08.02.2017.
 */
public interface PowierzenieService extends IOperations<Powierzenie> {
	void discardDesignation(int designationId);

	void acceptDesignation(int designationId);
}
