package com.bellinfo.hibernate.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

public class CriteriaClient {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();		
		Criteria  criteria =s.createCriteria(Employee.class);
	    List<Employee> empList =criteria.list();
	    for(Employee e:empList){
	    	System.out.println(e);
	    }
	    Criterion c1 =Restrictions.eq("empId", 11);
	    criteria.add(c1);
	    Employee e1 =(Employee)criteria.uniqueResult();
	    System.out.println(e1);
	    
	    Criteria ct1 = s.createCriteria(Employee.class);
	    Projection p1 = Projections.property("empName");
	    ct1.setProjection(p1);
	    List<String> eNameList = ct1.list();
	    
	    for(String name:eNameList){
	    	System.out.println(name);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    s.close();
	    sf.close();
	    
		
	}

}
