package com.microservice.user.microserviceuser.controller;

import com.microservice.user.microserviceuser.entities.User;
import com.microservice.user.microserviceuser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }
    @GetMapping("/all")
    public ResponseEntity<?> findAllUser(){
        return ResponseEntity.ok(userService.findAll());
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }
    @GetMapping("/search-by-driver/{idDriver}")
    public ResponseEntity<?> findByIdDriver(@PathVariable Long idDriver){
        return ResponseEntity.ok(userService.findByIdDriver(idDriver));
    }
}
