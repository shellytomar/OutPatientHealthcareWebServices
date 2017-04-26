package com.outpatientHealthcare.resource.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserVO {
	private int userId;
    private String email;
    private String name;
    private String password;
    private String phoneNumber;
    private int age;
    private float weight;
    private float height;
    private String gender;
    
    public UserVO(){
    	
    }
    
	public UserVO(int userId, String email, String name, String password, String phoneNumber, int age, float weight, float height,String gender) {
		super();
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.password = password;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}

