package com.bellinfo.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDMLUpdate {
	
	public static void main(String[] args){
		Student student = new Student();
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Student dbStudent =(Student)s.get(Student.class, 11);
		
		student.setId(11);
		student.setCourse("java");
		student.setDate(new Date());
		student.setMarks("70");
		student.setName("dadada");
		
		s.merge(student);
		tx.commit();
		Transaction txdel = s.beginTransaction();
		Student delStudent = new Student();
		delStudent.setId(12);
		s.delete(delStudent);
		txdel.commit();
		
		System.out.println("get record student details "+ dbStudent.getId() + " "+ dbStudent.getName() );
		s.close();
		sf.close();
		
	}
	
	

}
