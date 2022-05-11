package com.practice.demo.Error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason ="Username Not Found")
public class UserNameNotFound extends Exception {

}
