package com.bellinfo.hibernate.orm.inheritance;

public class ChequePayment extends Payment {

	
	private String chequeNo;
	private String chequeBy;
	
	
	public ChequePayment() {
		super();
	}
	public ChequePayment(int paymnetId, String amount,String chequeNo, String chequeBy) {
		super(paymnetId, amount);
		this.chequeNo = chequeNo;
		this.chequeBy = chequeBy;
	}


	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeBy() {
		return chequeBy;
	}
	public void setChequeBy(String chequeBy) {
		this.chequeBy = chequeBy;
	}
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeBy=" + chequeBy
				+ "]";
	}
	
	
}
