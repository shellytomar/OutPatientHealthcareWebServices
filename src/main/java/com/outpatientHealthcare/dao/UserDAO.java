package com.outpatientHealthcare.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.outpatientHealthcare.model.User;
import com.outpatientHealthcare.util.HibernateUtil;

public class UserDAO {
	
	public User getUser(int userId){
		User user = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery("from User where userId=:userId");
			query.setInteger("userId", userId);
			user = (User)query.uniqueResult();
			tx.commit();
		}catch(HibernateException e){
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return user;
	}
	
	public User saveUser(User user){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			int userId = (Integer) session.save(user);
			user.setUserId(userId);
			tx.commit();
		}catch(HibernateException e){
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return user;
	}
	
	public List<User> getUsers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<User> users = null;
		try{
			tx = session.beginTransaction();
			users = session.createQuery("from User").list();
			//Set<UserVO> userVOs = session.createCriteria(UserVO.class).list();
			tx.commit();
		}catch(HibernateException e){
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return users;
	}
	
	public User login(String email, String password) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		User user = null;
		try{
			tx = session.beginTransaction();
			user = (User)session.createQuery("from User where email=:email and password=:password").setString("email", email).setString("password",password).uniqueResult();
			//Set<UserVO> userVOs = session.createCriteria(UserVO.class).list();
			tx.commit();
		}catch(HibernateException e){
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return user;
	}
	



}
