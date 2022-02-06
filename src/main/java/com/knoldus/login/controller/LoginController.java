package com.knoldus.login.controller;


import com.knoldus.login.entity.Login;
import com.knoldus.login.repository.LoginRepository;
import com.knoldus.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public List<Login> getDetails()
    {
        return this.loginService.getAllLogins();
    }

    @PostMapping("/login")
    public Login saveLogin(@RequestBody Login login){

        return this.loginService.createLogin(login);
    }

}
