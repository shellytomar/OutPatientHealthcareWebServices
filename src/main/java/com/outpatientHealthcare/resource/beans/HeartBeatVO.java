package com.outpatientHealthcare.resource.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HeartBeatVO {
	private int id;
    private String date;
    private String maxTime;
    private String minTime;
    private int maxHeartRate;
    private int minHeartRate;
    
    public HeartBeatVO(){
    	
    }
    
    public HeartBeatVO(int id, String date, String maxTime, int maxHeartRate, String minTime, int minHeartRate) {
    	super();
    	this.id = id;
		this.date = date;
		this.maxTime = maxTime;
		this.minTime= minTime;
		this.maxHeartRate = maxHeartRate;
		this.minHeartRate = minHeartRate;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(String maxTime) {
		this.maxTime = maxTime;
	}
	
	public String getMinTime() {
		return minTime;
	}
	public void setMinTime(String minTime) {
		this.minTime = minTime;
	}
	
	public int getMaxHeartBeat(){
		return maxHeartRate;
	}
	public void setMaxHeartBeat(int maxHeartRate){
		this.maxHeartRate = maxHeartRate;
	}
	
	public int getMinHeartBeat(){
		return minHeartRate;
	}
	public void setMinHeartBeat(int minHeartRate){
		this.minHeartRate = minHeartRate;
	}
	
	
	
}

