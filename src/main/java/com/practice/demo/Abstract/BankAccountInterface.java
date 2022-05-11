package com.practice.demo.Abstract;

import com.practice.demo.models.AccountTransaction;
import com.practice.demo.models.AccountType;
import com.practice.demo.models.User;

import java.util.Date;
import java.util.List;

public interface BankAccountInterface {

    public double getAccountBal();
    public void setAccountBal(double accountBal);
    public Date getDateOpened();
    public void setDateOpened(Date dateOpened);
    public AccountType getType();
    public void setType(AccountType type);
    public void setTransactions(Transaction transaction);
    public List<Transaction> getTransactions();
    public void setUser(User user);
    public User getUser();


}
