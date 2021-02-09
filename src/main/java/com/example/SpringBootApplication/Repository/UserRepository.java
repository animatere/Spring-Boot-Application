package com.example.SpringBootApplication.Repository;

import com.example.SpringBootApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getUsersByVorname(String Vorname);
}
