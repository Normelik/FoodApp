package com.foodapp.backend.controllers;

import com.foodapp.backend.DTOs.RequestUserDto;
import com.foodapp.backend.DTOs.ResponseUserDTO;
import com.foodapp.backend.services.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }


    @PostMapping("/register")
    ResponseEntity<ResponseUserDTO> registerNewUser(@RequestBody RequestUserDto newUser) {
        return ResponseEntity.ok(userServiceImpl.saveNewUser(newUser));
    }
}
