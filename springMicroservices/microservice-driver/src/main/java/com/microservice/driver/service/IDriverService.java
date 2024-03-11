package com.microservice.driver.service;

import com.microservice.driver.entities.Driver;
import com.microservice.driver.http.response.UserByDriverResponse;

import java.util.List;

public interface IDriverService {
    List<Driver> findAll();
    Driver findById(Long id);

    void save(Driver driver);
    UserByDriverResponse findUserByIdDriver(Long idDriver);
}
