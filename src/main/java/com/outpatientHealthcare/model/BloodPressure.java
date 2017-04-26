package com.outpatientHealthcare.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="auth2_bpdatalist")
public class BloodPressure implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private int systolicBP;
    private int diastolicBP;
    private String dateTime;
    
    public BloodPressure() {
    	
    }
    
    public BloodPressure(int id,int systolicBP, int diatolicBP, String dateTime) {
    	super();
    	this.id=id;
    	this.systolicBP= systolicBP;
    	this.diastolicBP=diatolicBP;
    	this.dateTime=dateTime;
    }
    
    @Id
    @Column(name="id",unique=true,nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	@Column(name="LP")
	public int getSystolicBP() {
		return systolicBP;
	}
	public void setSystolicBP(int systolicBP) {
		this.systolicBP = systolicBP;
	}

	
	@Column(name="HP")
	public int getDiastolicBP() {
		return diastolicBP;
	}
	public void setDiastolicBP(int diastolicBP) {
		this.diastolicBP = diastolicBP;
	}

	
	@Column(name="measurement_time")
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
}
