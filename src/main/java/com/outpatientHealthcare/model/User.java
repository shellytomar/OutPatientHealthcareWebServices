package com.outpatientHealthcare.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int userId;
    private String email;
    private String name;
    private String password;
    private String phoneNumber;
    private int age;
    private float weight;
    private float height;
    private String gender;

    
    public User(){
    	
    }
    
    public User(int userId, String email, String name, String password,String phoneNumber, int age, float weight, float height,String gender) {
		super();
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
	}
    

	@Id
    @Column(name="user_id",unique=true,nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Column(name="email", nullable=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="name", nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="password",nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(name="phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Column(name="weight")
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@Column(name="height")
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	@Column(name="gender")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
