package com.practice.demo.controller;


import com.practice.demo.DemoApplication;
import com.practice.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    UserRepository uRepo;



}
