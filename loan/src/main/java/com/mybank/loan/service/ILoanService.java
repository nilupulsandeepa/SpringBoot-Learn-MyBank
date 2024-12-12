package com.mybank.loan.service;


import com.mybank.loan.dto.LoanDto;

public interface ILoanService {
    void createLoan(String mobileNumber);
    LoanDto fetchLoan(String mobileNumber);
    Boolean updateLoan(LoanDto loanDto);
    Boolean deleteLoan(String mobileNumber);
}
