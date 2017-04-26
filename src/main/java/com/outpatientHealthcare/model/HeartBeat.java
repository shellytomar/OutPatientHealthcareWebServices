package com.outpatientHealthcare.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="vw_heart_rate")
public class HeartBeat implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
    private String date;
    private String maxTime;
    private String minTime;
    private int minHeartRate;
    private int maxHeartRate;
    public HeartBeat(){
    	
    }
        
    public HeartBeat(int id, String date, String maxTime, int maxHeartRate, String minTime, int minHeartRate) {
    	this.id = id;
		this.date = date;
		this.maxTime = maxTime;
		this.minTime= minTime;
		this.maxHeartRate = maxHeartRate;
		this.minHeartRate = minHeartRate;
    }
    
    
	@Id
    @Column(name="id",unique=true,nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="date", nullable=false)
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Column(name="max_time",nullable=false)
	public String getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(String maxTime) {
		this.maxTime = maxTime;
	}
	
	@Column(name="min_time",nullable=false)
	public String getMinTime() {
		return minTime;
	}
	public void setMinTime(String minTime) {
		this.minTime = minTime;
	}
	
	@Column(name="max_value")
	public int getMaxHeartBeat(){
		return maxHeartRate;
	}
	public void setMaxHeartBeat(int maxHeartRate){
		this.maxHeartRate = maxHeartRate;
	}
	
	@Column(name="min_value")
	public int getMinHeartBeat(){
		return minHeartRate;
	}
	public void setMinHeartBeat(int minHeartRate){
		this.minHeartRate = minHeartRate;
	}
	
}
