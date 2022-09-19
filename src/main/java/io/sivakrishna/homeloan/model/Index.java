package io.sivakrishna.homeloan.model;

public class Index {

	
	private int loanAmount;
	private float interest;
	private int period;
	
	
	
	public Index() {
		
		
		
		
	}
	
	
	public Index(int loanAmount, float interest, int period) {
		super();
		this.loanAmount = loanAmount;
		this.interest = interest;
		this.period = period;
	}
	
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
}
