package com.outpatientHealthcare.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.outpatientHealthcare.model.BloodPressure;
import com.outpatientHealthcare.util.HibernateUtil;

public class BloodPressureDAO {
	
	public List<BloodPressure> getBloodPressure() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<BloodPressure> bloodpressure = null;
		try{
			tx = session.beginTransaction();
			bloodpressure = session.createQuery("from BloodPressure").list();
			tx.commit();
		}catch(HibernateException e){
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return bloodpressure;
	}

}
