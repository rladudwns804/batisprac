package com.practice.demo.models;


import com.practice.demo.Abstract.BankAccount;
import com.practice.demo.Abstract.Transaction;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class CheckingAccount extends BankAccount {

    public void setTransactions(Transaction transaction){
        super.setTransactions(transaction);
    }



}
