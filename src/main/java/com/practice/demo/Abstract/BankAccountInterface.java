package com.practice.demo.Abstract;

import com.practice.demo.models.AccountType;

import java.util.Date;

public interface BankAccountInterface {

    public long getId();
    public void setId(long id);
    public long getAccountNum();
    public void setAccountNum(long accountNum);
    public double getAccountBal();
    public void setAccountBal(double accountBal);
    public Date getDateOpened();
    public void setDateOpened(Date dateOpened);
    public AccountType getType();
    public void setType(AccountType type);



}
