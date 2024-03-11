package com.microservice.user.microserviceuser.service;

import com.microservice.user.microserviceuser.entities.User;
import com.microservice.user.microserviceuser.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findByIdDriver(Long idDriver) {
        return userRepository.findAllUser(idDriver);
    }
}
