package com.practice.demo.Abstract;

import com.practice.demo.models.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BankAccount implements  BankAccountInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true, nullable = false, updatable = false)
    private long accountNum;
    @Column
    private double accountBal;
    @Column(unique = true, nullable = false, updatable = false)
    private Date dateOpened;
    @Column(nullable = false,updatable = false)
    private AccountType type;


}
