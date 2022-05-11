package com.practice.demo.controller;

import com.practice.demo.Error.UserNameExist;
import com.practice.demo.Error.UserNameNotFound;
import com.practice.demo.Repositories.UserRepository;
import com.practice.demo.models.User;
import com.practice.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userapi")
public class UserController {
    @Autowired
    UserRepository uRepo;
    @Autowired
    AccountService accountService;

    @PostMapping(value="/adduser")
    public void adduser(@RequestBody User user) throws UserNameExist {
        if(uRepo.findByUsername(user.getUsername()) !=null) {
            throw new UserNameExist();
        }
        else{
            uRepo.save(user);
            System.out.println("Successfully added user");
        }
    }
    
    @GetMapping(value="/getuser")
    public User getuser(@RequestParam String username) throws UserNameNotFound {

        if(uRepo.findByUsername(username) == null){
           throw new UserNameNotFound();
        }
        else {
            return uRepo.findByUsername(username);
        }
    }


    @GetMapping(value="/getalluser")
    public List<User> getalluser(){
        return uRepo.findAll();
    }

    @PostMapping(value="/createchecking")
    public void createChecking(@RequestParam String username){

        User user = uRepo.findByUsername(username);
        accountService.createCheckingAccount(user);

    }
    @PostMapping(value="/createsaving")
    public void createSaving(@RequestParam String username){

        User user = uRepo.findByUsername(username);
        accountService.createSavingAccount(user);

    }


}
