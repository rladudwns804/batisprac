package com.practice.demo.Abstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Transaction {


    private long transactionID;
    private long accountNum;
    private TransactionType type;
    private double transactionAmt;
    private Date transactionDate;



}
