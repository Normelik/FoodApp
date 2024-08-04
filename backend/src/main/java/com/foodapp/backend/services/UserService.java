package com.foodapp.backend.services;

import com.foodapp.backend.DTOs.RequestUserDto;
import com.foodapp.backend.DTOs.ResponseUserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    ResponseUserDTO saveNewUser(RequestUserDto requestUserDto);
}
