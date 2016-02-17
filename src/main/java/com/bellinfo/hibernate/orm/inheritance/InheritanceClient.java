package com.bellinfo.hibernate.orm.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
	    
    CreditCardPayment ccP1 = new CreditCardPayment(1, "50", "1234-4321-4323-5434", "321"); 
    CreditCardPayment ccP2 = new CreditCardPayment(1, "250", "1234-4321-4323-7645", "123");
    CreditCardPayment ccP3 = new CreditCardPayment(1, "1230", "1234-4321-4323-5433", "543");
    CreditCardPayment ccP4 = new CreditCardPayment(1, "876", "1234-4321-4323-4322", "765");
	
    ChequePayment cp1 = new ChequePayment(1, "132", "143232-012","Siva");
    ChequePayment cp2 = new ChequePayment(1, "543", "143232-654","akhil");
    ChequePayment cp3 = new ChequePayment(1, "653", "143232-765","amar");
    ChequePayment cp4 = new ChequePayment(1, "7654", "143232-876","kumar");

    s.save(ccP1);
    s.save(ccP2);
    s.save(ccP3);
    s.save(ccP4);
    
    s.save(cp1);
    s.save(cp2);
    s.save(cp3);
    s.save(cp4);
    
    tx.commit();
    
    s.close();
    sf.close();
   
	}

}
