package com.spring.rest.springrest.services;

import com.spring.rest.springrest.entities.User;
import com.spring.rest.springrest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return (List<User>)userRepository.findAll();
    }

    public User getUserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return  optionalUser.isPresent() ? optionalUser.get() : null;
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}
