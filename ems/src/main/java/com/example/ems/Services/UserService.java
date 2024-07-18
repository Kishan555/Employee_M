package com.example.ems.Services;

import com.example.ems.Models.User;
import com.example.ems.Repositories.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        //user.setPassword(user.getPassword());
        System.out.println(user.getEmail());
        try{
            return userRepository.save(user);
        }
        catch(Exception e){
            System.out.println(e);
            return user;
        }
    }
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}