package com.practice.demo.Error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason = "Username Exist, try other")
public class UserNameExist extends Exception {



}
