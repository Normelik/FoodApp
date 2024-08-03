package com.foodapp.backend.services;

import com.foodapp.backend.DTOs.RequestUserDto;
import com.foodapp.backend.DTOs.ResponseUserDTO;
import com.foodapp.backend.models.User;
import com.foodapp.backend.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseUserDTO saveNewUser(RequestUserDto requestUserDto) {
        User user = new User();
        user.setUsername(requestUserDto.getUsername());
        user.setPassword(requestUserDto.getPassword());
        userRepository.save(user);

        return new ResponseUserDTO(
                user.getUsername(),
                user.getPassword()
        );
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username).orElseThrow(
//                () -> new UsernameNotFoundException(username + " not found")
//        );
//        return new CustomUserDetails(user);
//    }
}
