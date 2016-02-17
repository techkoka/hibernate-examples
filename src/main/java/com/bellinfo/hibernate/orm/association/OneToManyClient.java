package com.bellinfo.hibernate.orm.association;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    Part part1 = new Part(1, "monitor");
	    Part part2 = new Part(2, "keyboard");
	    Part part3 = new Part(3, "mouse");
	    
	    Set<Part> partSet = new HashSet<>();
	    partSet.add(part1);
	    partSet.add(part2);
	    partSet.add(part3);
	    Product p4 = new Product(1,"Desktop",partSet);
	    
	    s.save(p4);
	    tx.commit();
	    s.close();
	    sf.close();
	    
	    
	    
	    

	}

}
