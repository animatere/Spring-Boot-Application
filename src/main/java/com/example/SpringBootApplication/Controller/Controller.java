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

    @PostMapping(value = "/users/add", consumes = "application/json", produces = "application/json")
    public User post(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping(value = "/users/all", produces = "application/json")
    public List<User> getUsers() {
        return userRepo.getList();
    }

    @GetMapping(value = "/users/id/{id}", produces = "application/json")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable(value = "id") Long id) {
        Optional<User> user = userRepo.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value = "/users/first/{vorname}", produces = "application/json")
    public List<User> findByVornameLike(@PathVariable String vorname) {
        return userRepo.findByVornameLike(vorname);
    }

    @GetMapping(value = "/users/last/{name}", produces = "application/json")
    public List<User> findByNameLike(@PathVariable String name) {
        return userRepo.findByNameLike(name);
    }

}
