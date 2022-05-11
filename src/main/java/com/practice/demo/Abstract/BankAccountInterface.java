package com.practice.demo.Abstract;

import com.practice.demo.models.AccountTransaction;
import com.practice.demo.models.AccountType;
import com.practice.demo.models.User;

import java.time.Instant;
import java.util.List;

public interface BankAccountInterface {

    public double getAccountBal();
    public void setAccountBal(double accountBal);
    public Instant getDateOpened();
    public void setDateOpened(Instant dateOpened);
    public AccountType getType();
    public void setType(AccountType type);
    public void setTransactions(Transaction transaction);
    public List<Transaction> getTransactions();
    public void setUser(User user);
    public User getUser();


}
