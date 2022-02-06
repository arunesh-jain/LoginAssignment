package com.knoldus.login.service.impl;

import com.knoldus.login.entity.Login;
import com.knoldus.login.repository.LoginRepository;
import com.knoldus.login.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    private LoginRepository loginRepository;
    public LoginServiceImpl(LoginRepository loginRepository) {
        super();
        this.loginRepository = loginRepository;
    }

    @Override
    public List<Login> getAllLogins(){
        return loginRepository.findAll();
    }

    @Override
    public Login createLogin(Login details) {
        return loginRepository.save(details);
    }

}
