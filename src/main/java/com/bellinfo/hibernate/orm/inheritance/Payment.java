package com.bellinfo.hibernate.orm.inheritance;

public class Payment {

	private int paymentId;
	private String amount;
	
	public Payment() {
		super();
	}
	public Payment(int paymentId, String amount) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + "]";
	}
	
	
	
}
