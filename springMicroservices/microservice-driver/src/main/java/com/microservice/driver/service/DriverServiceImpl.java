package com.microservice.driver.service;

import com.microservice.driver.client.UserClient;
import com.microservice.driver.dto.UserDTO;
import com.microservice.driver.entities.Driver;
import com.microservice.driver.http.response.UserByDriverResponse;
import com.microservice.driver.persistence.IDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceImpl implements IDriverService{
    @Autowired
    private IDriverRepository driverRepository;
    @Autowired
    private UserClient userClient;
    @Override
    public List<Driver> findAll() {
        return (List<Driver>) driverRepository.findAll();
    }

    @Override
    public Driver findById(Long id) {
        return driverRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public UserByDriverResponse findUserByIdDriver(Long idDriver) {

        Driver driver = driverRepository.findById(idDriver).orElse(new Driver());

        List<UserDTO> userDTOList = userClient.findAllUserByDriver(idDriver);
        return UserByDriverResponse.builder()
                .driverName(driver.getName())
                .trips(driver.getTrips())
                .userDTOList(userDTOList)
                .build();
    }
}
