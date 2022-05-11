package com.practice.demo.Repositories;

import com.practice.demo.Abstract.BankAccount;
import com.practice.demo.models.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsRepository extends JpaRepository<BankAccount, Long> {
    List<BankAccount> findByAccountId(long id);

}
