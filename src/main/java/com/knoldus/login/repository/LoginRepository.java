package com.knoldus.login.repository;

import com.knoldus.login.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Long> {

}
