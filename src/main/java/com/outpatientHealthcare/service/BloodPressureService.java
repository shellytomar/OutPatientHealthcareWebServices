package com.outpatientHealthcare.service;

import java.util.List;

import com.outpatientHealthcare.dao.BloodPressureDAO;
import com.outpatientHealthcare.model.BloodPressure;

public class BloodPressureService {
	
	private BloodPressureDAO bpDAO;
	
	public BloodPressureService(){
		bpDAO = new BloodPressureDAO();
	}
	
	public List<BloodPressure> getBloodPressure() {
		return bpDAO.getBloodPressure();
	}

}
