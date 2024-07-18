package com.example.ems.Controller;

import com.example.ems.Models.User;
import com.example.ems.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("signup")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
       
        try{
            // System.out.println("it is getting called");
            // System.out.println(user.getEmail());
            if (!userService.findByEmail(user.getEmail()).isEmpty()) {
            // if(true){       
                // System.out.println(userService.findByEmail(user.getEmail()));
                return ResponseEntity.badRequest().body("Email is already in use");
             }
            else {
                userService.registerUser(user);
                return ResponseEntity.ok("User registered successfully");
            }
        }
        catch(Exception e){
            return ResponseEntity.ok("exception");
        }
    }


    
}