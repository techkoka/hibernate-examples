package com.bellinfo.hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDMLSave {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s = new Student();
		s.setId(25);
		s.setName("imran");
		s.setMarks("80");
		s.setDate(new Date(83,03,28));
        s.setCourse("java");
        
        session.saveOrUpdate(s);
       // System.out.println("inserted record number"+recordId);
        tx.commit();
        session.close();
        sf.close();
        
        
	}

}
