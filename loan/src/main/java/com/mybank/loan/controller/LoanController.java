package com.mybank.loan.controller;

import com.mybank.loan.constant.LoanConstant;
import com.mybank.loan.dto.CreateLoanDto;
import com.mybank.loan.dto.LoanDto;
import com.mybank.loan.dto.ResponseDto;
import com.mybank.loan.service.ILoanService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class LoanController {

    private ILoanService loanService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createLoan(@RequestBody CreateLoanDto loanDto) {
        loanService.createLoan(loanDto.getMobileNumber());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(LoanConstant.STATUS_201, LoanConstant.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<LoanDto> fetchLoan(@RequestParam String mobileNumber) {
        LoanDto loanDto = loanService.fetchLoan(mobileNumber);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(loanDto);
    }
}
