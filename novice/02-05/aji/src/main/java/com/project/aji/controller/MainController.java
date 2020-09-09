package com.project.aji.controller;

import com.project.aji.model.User;
import com.project.aji.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path="/demo")
public class MainController{
    @Autowired
    private UserRepository userRepository;

@GetMapping(path="/all")
    Iterable<User> All() {
        return userRepository.findAll(); 
    }

@GetMapping("/ambil/{id}")
    User userById(@PathVariable Integer id){
        return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

@PostMapping(path="/add")
     User save(@RequestBody User user) {
        return userRepository.save(user);
        }

@DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }

@PutMapping("/update/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Integer id) {
        return userRepository.findById(id)
        .map(user -> {
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            return userRepository.save(user);
        })
        .orElseGet(() -> {
            newUser.setId(id);
            return userRepository.save(newUser);
        });
        } 
    }


