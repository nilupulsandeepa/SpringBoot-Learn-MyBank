package com.mybank.loan.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoanDto {
    private String mobileNumber;
    private String loanNumber;
    private String loanType;
    private int totalLoan;
    private int amountPaid;
    private int outstandingAmount;
}
