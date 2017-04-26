package com.outpatientHealthcare.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.outpatientHealthcare.model.HeartBeat;
import com.outpatientHealthcare.util.HibernateUtil;

public class HeartBeatDAO {
	
	public List<HeartBeat> getHeartBeat() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<HeartBeat> heartBeat = null;
		try{
			tx = session.beginTransaction();
			heartBeat = session.createQuery("from HeartBeat").list();
			tx.commit();
		}catch(HibernateException e){
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return heartBeat;
	}

}
