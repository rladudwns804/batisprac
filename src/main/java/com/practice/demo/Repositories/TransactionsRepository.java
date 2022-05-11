package com.practice.demo.Repositories;

import com.practice.demo.Abstract.BankAccount;
import com.practice.demo.Abstract.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionsRepository extends JpaRepository<Transaction, Long> {

     Transaction findBytransactionID(long id);
     List<Transaction> findByAccount(BankAccount account);
}
