package com.example.SpringBootApplication.Controller;

import com.example.SpringBootApplication.Model.User;
import com.example.SpringBootApplication.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private UserServiceImpl userRepo;


    @GetMapping(value = "/users", produces = "application/json")
    public List<User> getUsers() {
        return userRepo.getList();
    }

    @GetMapping(value = "/users/{id}", produces = "application/json")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable(value = "id") Long id) {

        Optional<User> user = userRepo.findById(id);

        return ResponseEntity.ok().body(user);
    }

    @PostMapping(value = "/users", consumes = "application/json", produces = "application/json")
    public User post(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping(value = "/users/{vorname}", produces = "application/json")
    public List<User> getUserByFirstName(@PathVariable(value = "vorname") String name) {
        return userRepo.getUsersByFirstName(name);
    }


}
