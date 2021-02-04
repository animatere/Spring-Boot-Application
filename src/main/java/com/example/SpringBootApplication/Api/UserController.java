package com.example.SpringBootApplication.Api;

import com.example.SpringBootApplication.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserController extends CrudRepository<User, Long> {
}
