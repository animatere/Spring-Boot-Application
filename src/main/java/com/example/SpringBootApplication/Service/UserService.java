package com.example.SpringBootApplication.Service;

import com.example.SpringBootApplication.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    User save(User user);

    List<User> getList();

    Optional<User> findById(Long id);

    List<User> getUsersByFirstName(String vorname);

}
