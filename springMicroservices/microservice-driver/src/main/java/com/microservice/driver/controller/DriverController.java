package com.microservice.driver.controller;

import com.microservice.driver.entities.Driver;
import com.microservice.driver.service.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
    @Autowired
    private IDriverService driverService;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDriver(@RequestBody Driver driver){
        driverService.save(driver);
    }
    @GetMapping("/all")
    public ResponseEntity<?> findAllUser(){
        return ResponseEntity.ok(driverService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(driverService.findById(id));
    }

    @GetMapping("/search-user/{idDriver}")
    public ResponseEntity<?> findUserByIdDriver(@PathVariable Long idDriver){
        return ResponseEntity.ok(driverService.findUserByIdDriver(idDriver));
    }

}
