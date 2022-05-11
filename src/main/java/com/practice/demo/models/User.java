package com.practice.demo.models;

import com.practice.demo.Abstract.BankAccount;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_id")
    private long id;

    @Column(name= "Username")
    private String username;

    @Column(name="Password")
    private String password;

    @Column(name ="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name="DOB")
    private String dob;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    private List<BankAccount> accounts = new ArrayList<BankAccount>();
    public void setAccounts(BankAccount account){
        accounts.add(account);
    }

}
