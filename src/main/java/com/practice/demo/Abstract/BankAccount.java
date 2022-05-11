package com.practice.demo.Abstract;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practice.demo.models.AccountTransaction;
import com.practice.demo.models.AccountType;
import com.practice.demo.models.User;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BankAccount implements  BankAccountInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name= "User_ID")
    private User user;
    @Column
    private double accountBal;
    @Column(unique = true, nullable = false, updatable = false)
    private Instant dateOpened;
    @Enumerated(EnumType.ORDINAL)
    private AccountType type;
    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public void setTransactions(Transaction transaction){
        this.transactions.add(transaction);
    }




}
