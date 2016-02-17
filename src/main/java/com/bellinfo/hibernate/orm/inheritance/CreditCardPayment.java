package com.bellinfo.hibernate.orm.inheritance;

public class CreditCardPayment extends Payment{
	
	private String ccNumber;
	private String cccvv;
	
	public CreditCardPayment() {
		super();
	}
	public CreditCardPayment(int paymentId, String amount, String ccNumber, String cccvv) {
		super(paymentId, amount);
		this.ccNumber = ccNumber;
		this.cccvv = cccvv;
	}

	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCccvv() {
		return cccvv;
	}
	public void setCccvv(String cccvv) {
		this.cccvv = cccvv;
	}
	@Override
	public String toString() {
		return "CreditCardPayment [ccNumber=" + ccNumber
				+ ", cccvv=" + cccvv + "]";
	}
	
	

}
