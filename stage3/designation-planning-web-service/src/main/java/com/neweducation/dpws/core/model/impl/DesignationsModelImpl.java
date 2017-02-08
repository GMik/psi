package com.neweducation.dpws.core.model.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.neweducation.dpws.core.model.AbstractModel;
import com.neweducation.dpws.core.model.DesignationsModel;

import dtos.DesignationTo;

@Component
public class DesignationsModelImpl extends AbstractModel implements DesignationsModel {

	public List<DesignationTo> getDesignations() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateDesignationsForCourse(String courseId, List<DesignationTo> designations) {
		// TODO Auto-generated method stub

	}

	@Override
	public void discardDesignation(int designationId) {
		try {
			this.dataFacade.discardDesignation(designationId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void acceptDesignation(int designationId) {
		try {
			this.dataFacade.acceptDesignation(designationId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
