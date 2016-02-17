package com.bellinfo.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Student student = new Student();
       student.setId(7);
       student.setName("Siva");
       student.setDate(new Date());
       student.setCourse("java");
       student.setMarks("100");
       Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
       SessionFactory sf = cfg.buildSessionFactory();
       Session s = sf.openSession();
       Transaction tx = s.beginTransaction();
       s.save(student);
       tx.commit();
       s.evict(student);
       
       s.close();
       sf.close();
       
    	
    }
}
