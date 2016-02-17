package com.bellinfo.hibernate;

import java.util.Date;

public class Student {

	private int id;
	private String name;
	private Date date;
	private String course;
	private String marks;
	
	
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Student [id=" + getId() + ", name=" + name + ", date=" + date
				+ ", course=" + course + ", marks=" + marks + "]";
	}
	
	
	
	

}
