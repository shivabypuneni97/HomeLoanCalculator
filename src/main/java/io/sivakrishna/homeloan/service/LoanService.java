package io.sivakrishna.homeloan.service;

import java.util.List;

import io.sivakrishna.homeloan.model.Index;
import io.sivakrishna.homeloan.model.Loan;



public interface LoanService {
	public List<Loan> loanCalculate(Index index);

}
