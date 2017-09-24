package com.sas.web.daoImpl;

import org.apache.catalina.Session;
import org.springframework.stereotype.Repository;
import com.sas.web.dao.RegistrationDao;
import com.sas.web.entity.RegistrationEntity;


@Repository
public class RegistrationDaoImpl implements RegistrationDao{
	
	public void saveRegistration(RegistrationEntity registrationEntity) {
		System.out.println("dao");
	//	SessionFactory sessionFactory1 = new  AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = null;
	   // Transaction transaction=null;
//	    session = sessionFactory1.openSession();
//	    transaction = session.beginTransaction();
//        transaction.begin();
//        session.save(registrationEntity);
//        transaction.commit();
//        session.close();
	}
}
