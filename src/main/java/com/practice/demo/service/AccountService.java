package com.practice.demo.service;

import com.practice.demo.Abstract.BankAccount;
import com.practice.demo.Repositories.AccountsRepository;
import com.practice.demo.Repositories.UserRepository;
import com.practice.demo.models.AccountType;
import com.practice.demo.models.CheckingAccount;
import com.practice.demo.models.SavingAccount;
import com.practice.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class AccountService {

   @Autowired
   AccountsRepository aRepo;
   @Autowired
   UserRepository uRepo;


   public void createCheckingAccount(User user){
      CheckingAccount account = new CheckingAccount();
      account.setType(AccountType.CHECKING);
      account.setDateOpened(Instant.now());
      account.setUser(user);
      user.setAccounts(account);
      aRepo.save(account);
      uRepo.save(user);
      System.out.println("Successfully created Checking Account");
   }

   public void createSavingAccount(User user){
      SavingAccount account = new SavingAccount();
      account.setType(AccountType.SAVING);
      account.setDateOpened(Instant.now());
      account.setUser(user);
      user.setAccounts(account);
      aRepo.save(account);
      uRepo.save(user);
      System.out.println("Successfully created Saving Account");
   }

}
