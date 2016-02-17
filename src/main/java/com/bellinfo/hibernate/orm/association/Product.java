package com.bellinfo.hibernate.orm.association;

import java.util.Set;

public class Product {
	
	private int pid;
	private String pName;
	private Set<Part> parts;
	
	public Product() {
	}
	public Product(int pid, String pName, Set parts) {
		this.pid = pid;
		this.pName = pName;
		this.parts = parts;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Set<Part> getParts() {
		return parts;
	}
	public void setParts(Set<Part> parts) {
		this.parts = parts;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", parts=" + parts
				+ "]";
	}

	

}
