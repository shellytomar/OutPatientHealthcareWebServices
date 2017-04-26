package com.outpatientHealthcare.service;

import java.util.List;

import com.outpatientHealthcare.dao.HeartBeatDAO;
import com.outpatientHealthcare.model.HeartBeat;

public class HeartBeatService {
private HeartBeatDAO heartBeatDAO;
	
	public HeartBeatService(){
		heartBeatDAO = new HeartBeatDAO();
	}
	
	public List<HeartBeat> getHeartBeat() {
		return heartBeatDAO.getHeartBeat();
	}
}
