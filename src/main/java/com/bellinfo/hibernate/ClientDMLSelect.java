package com.bellinfo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDMLSelect {
	
	public static void main(String args[]){
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
        Student ss = (Student)s.get(Student.class, 55);
		System.out.println("***********************");
		Student syz = (Student)s.load(Student.class, 55);
		s.close();
		sf.close();

		
		
	}
}


