package com.microservice.user.microserviceuser.service;

import com.microservice.user.microserviceuser.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    List<User> findByIdDriver(Long idDriver);
}
