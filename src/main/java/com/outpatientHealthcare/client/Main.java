package com.outpatientHealthcare.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.outpatientHealthcare.model.User;
import com.outpatientHealthcare.dao.UserDAO;
import com.outpatientHealthcare.util.HibernateUtil;

public class Main {
	/*
	
	public static void main (String args[]){
		User user = new User();
		UserDAO userDAO = new UserDAO();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		user.setUserId(5);
		user.setEmail("ankitmadaan106@gmail.com");
		user.setName("Ankit");
		user.setPassword("Password1");
		user.setGender("Male");
		user.setAge(29);
		user.setHeight(75);
		user.setPhoneNumber("4086790936");
		user.setWeight(170);
		
		System.out.println("Reached this point================");
		
		//SessionFactory sessionFactory = new Configuration().configure("/resources/hibernate.cfg.xml").buildSessionFactory();
		//Session session = sessionFactory.openSession();
		//session.beginTransaction();
		
		//session.save(user);
		userDAO.saveUser(user);
		
		//session.getTransaction().commit();
		//session.close();
		
	}
	
	*/

}
