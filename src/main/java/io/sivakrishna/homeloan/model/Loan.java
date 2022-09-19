package io.sivakrishna.homeloan.model;

public class Loan {
	
	

	private int month;
	private int loanBalance;
	private int emi;
	private int principal;
	private int monthlyInterest;
	private int outStandingBalance;
	
	
	public Loan() {
		
	}


	public Loan(int month, int loanBalance, int emi, int principal, int monthlyInterest, int outStandingBalance) {
		super();
		this.month = month;
		this.loanBalance = loanBalance;
		this.emi = emi;
		this.principal = principal;
		this.monthlyInterest = monthlyInterest;
		this.outStandingBalance = outStandingBalance;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getLoanBalance() {
		return loanBalance;
	}


	public void setLoanBalance(int loanBalance) {
		this.loanBalance = loanBalance;
	}


	public int getEmi() {
		return emi;
	}


	public void setEmi(int emi) {
		this.emi = emi;
	}


	public int getPrincipal() {
		return principal;
	}


	public void setPrincipal(int principal) {
		this.principal = principal;
	}


	public int getMonthlyInterest() {
		return monthlyInterest;
	}


	public void setMonthlyInterest(int monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}


	public int getOutStandingBalance() {
		return outStandingBalance;
	}


	public void setOutStandingBalance(int outStandingBalance) {
		this.outStandingBalance = outStandingBalance;
	}
	
}
