package com.practice.demo.models;


import com.practice.demo.Abstract.BankAccount;
import com.practice.demo.Abstract.Transaction;

public class CheckingAccount extends BankAccount {

    public void setTransaction(Transaction transaction){
        super.setTransactions(transaction);
    }

}
