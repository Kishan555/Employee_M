package com.example.ems.Repositories;

import com.example.ems.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;



public interface UserRepository extends MongoRepository<User, String> {  // Change Long to String for the ID type
    Optional<User> findByEmail(String email);

}
