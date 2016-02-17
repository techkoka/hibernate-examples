package com.bellinfo.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLCRUDClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	       SessionFactory sf = cfg.buildSessionFactory();
	       Session s = sf.openSession();
	       Transaction tx = s.beginTransaction();		
		
	 //String updateEmp = "update Employee set empName='dsdsdsds' where empName='Koka'";       
	 
	 //String deleteEmp = "delete Employee where empId='2'";
	 /*String selectEmp = "from Employee where empId='1'";
	 Query query = s.createQuery(selectEmp);     
     Employee e1 = (Employee)query.uniqueResult();	
     System.out.println("employee details :"+e1);*/
	       
/*	 String allRecords = "from Employee";
	 Query query = s.createQuery(allRecords);
	
	 List<Employee> empList =  query.list();
	 for(Employee e:empList){
		 System.out.println(e);
	 }*/
	       
	 /*String empNames ="select empName from Employee";       
	 Query query = s.createQuery(empNames);
	 
	 List<String> empNameList = query.list();
	 for(String name:empNameList){
		 System.out.println("name :" + name);
	 }*/
	       
	  /*String empNames ="select empName,salary from Employee";       
	  	 Query query = s.createQuery(empNames);
	  	 
	  	 List<Object> objList = query.list();
	  	 for(Object obj:objList){
	  		  Object[] objArray = (Object[])obj;
	  		  System.out.println(objArray[0]);
	  		  System.out.println(objArray[1]);
	  		 
	  	 }*/
	       
	       String empNames ="select max(salary) from Employee";       
		  	 Query query = s.createQuery(empNames);
		  
		  double d =((Double)query.uniqueResult()).doubleValue();	 
		  System.out.println("max salary :" +d);	      
	  	 
	  	 
	 s.close();
     sf.close();
     
 }

}










