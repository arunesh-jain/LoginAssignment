package com.knoldus.login.service;

import com.knoldus.login.entity.Login;

import java.util.List;

public interface LoginService {

    List<Login> getAllLogins();

    Login createLogin(Login customer);

}
