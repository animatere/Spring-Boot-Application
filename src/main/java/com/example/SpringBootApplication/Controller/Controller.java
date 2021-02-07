package com.example.SpringBootApplication.Controller;

import com.example.SpringBootApplication.Model.User;
import com.example.SpringBootApplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable(value = "id") Long id) {

        Optional<User> user = userRepo.findById(id);

        return ResponseEntity.ok().body(user);
    }

//    @PostMapping("/users")
//    public User createEmployee(@RequestBody User user) {
//        return userRepo.save(user);
//    }

//    @GetMapping("/users/{vorname}")
//    public List<User> getUserBySurname(@PathVariable(value = "vorname") String vorname){
//
//        List<User> allUsers = userRepo.findAll();
//        List<User> requestedUsers = new ArrayList<>();
//
//        for(User user: allUsers){
//            if(user.getVorname().equals(vorname)){
//                requestedUsers.add(user);
//            }
//        }
//
//        return requestedUsers;
//    }

}
