package com.bellinfo.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLClient {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	       SessionFactory sf = cfg.buildSessionFactory();
	       Session s = sf.openSession();
	       Transaction tx = s.beginTransaction();		
		
	    Employee e1 = new Employee(1, "Siva", "Java", 4000.00); 
	    Employee e2 = new Employee(1, "Koka", "Scala", 5400.00);
	    Employee e3 = new Employee(1, "Sontosh", "Ui", 6540.00);
	    Employee e4 = new Employee(1, "raghav", "bigData", 7640.00);
	    Employee e5 = new Employee(1, "Imran", "net", 6522.00);
	    
	    s.save(e1);
	    s.save(e2);
	    s.save(e3);
	    s.save(e4);
	    s.save(e5);
	    tx.commit();
	    
	    s.close();
	    sf.close();
	}

}






