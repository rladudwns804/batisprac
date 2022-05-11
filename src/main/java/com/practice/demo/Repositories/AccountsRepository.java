package com.practice.demo.Repositories;

import com.practice.demo.models.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingsRepository extends JpaRepository<CheckingAccount, Long> {

    CheckingAccount findByAccountNum(long id);

}
