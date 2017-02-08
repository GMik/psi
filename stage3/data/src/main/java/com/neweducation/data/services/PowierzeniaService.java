package com.neweducation.data.services;

/**
 * Created by Maciej Wolański
 * maciekwski@gmail.com
 * on 08.02.2017.
 */
public interface PowierzeniaService {
    void discardDesignation(int designationId);

    void acceptDesignation(int designationId);
}
