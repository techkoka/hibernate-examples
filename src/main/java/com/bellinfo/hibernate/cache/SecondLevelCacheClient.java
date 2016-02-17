package com.bellinfo.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bellinfo.hibernate.hql.Employee;

public class SecondLevelCacheClient {

	public static void main(String[] args) {
		   Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		   SessionFactory sf = cfg.buildSessionFactory();
		   Session s1 = sf.openSession();		
		   Session s2 = sf.openSession();
		   
		  Employee e1 =(Employee) s1.get(Employee.class, 3);
		  e1 =(Employee) s2.get(Employee.class, 3);
		  
		  s1.close();
		  s2.close();
		  sf.close();
		  
	}

}
