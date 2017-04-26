package com.outpatientHealthcare.resource.beans;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class BloodPressureVO {
	
	private int id;
	private int systolicBP;
    private int diastolicBP;
    private String dateTime;
    
    public BloodPressureVO() {
    	
    }
    
    public BloodPressureVO(int id,int systolicBP, int diatolicBP, String dateTime) {
    	super();
    	this.id = id;
    	this.systolicBP= systolicBP;
    	this.diastolicBP=diatolicBP;
    	this.dateTime=dateTime;
    }
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getSystolicBP() {
		return systolicBP;
	}

	public void setSystolicBP(int systolicBP) {
		this.systolicBP = systolicBP;
	}

	public int getDiastolicBP() {
		return diastolicBP;
	}

	public void setDiastolicBP(int diastolicBP) {
		this.diastolicBP = diastolicBP;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
