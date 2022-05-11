package com.practice.demo.service;

import com.practice.demo.Repositories.AccountsRepository;
import com.practice.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

   @Autowired
   AccountsRepository aRepo;


   public void createCheckingAccount(User user){



   }

}
