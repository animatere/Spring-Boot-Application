//package com.example.SpringBootApplication.Controller;
//
//import com.example.SpringBootApplication.Model.User;
////import com.example.SpringBootApplication.Service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class Controller {
//
//    @Autowired
//    private IUserService userService;
//
//    @RequestMapping("/users")
//    public List<User> getUsers() {
//
//        return userService.findAll();
//    }
//
//    @ExceptionHandler(EmptyResultDataAccessException.class)
//    public ResponseEntity<String> noCityFound(EmptyResultDataAccessException e) {
//
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No City found");
//    }
//}
