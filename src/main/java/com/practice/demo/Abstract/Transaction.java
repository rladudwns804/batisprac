package com.practice.demo.Abstract;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.practice.demo.models.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Transaction implements TransactionInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transactionID;
    @ManyToOne
    @JoinColumn(name="Account_ID")
    @JsonIgnore
    private BankAccount account;
    @Column(name = "Transaction_Type")
    private TransactionType type;
    @Column(name = "Transaction_Amount")
    private double transactionAmt;
    @Column(name = "Transaction_Date")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date transactionDate;

}
