package com.practice.demo.Abstract;

import com.practice.demo.models.AccountType;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BankAccount implements  BankAccountInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountNum;
    @Column
    private double accountBal;
    @Column(unique = true, nullable = false, updatable = false)
    private Date dateOpened;
    @Column(nullable = false,updatable = false)
    private AccountType type;
    @Column
    @Setter(AccessLevel.NONE)
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public void setTransactions(Transaction transaction){
        this.transactions.add(transaction);
    }




}
