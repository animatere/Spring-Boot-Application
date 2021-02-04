//package com.example.SpringBootApplication.Service;
//
//import com.example.SpringBootApplication.Model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.util.List;
//
//public class UserService implements IUserService{
//
//    @Autowired
//    JdbcTemplate jtm;
//
//    @Override
//    public List<User> findAll(){
//
//        String sql = "SELECT * FROM USER";
//        return this.jtm.query(sql, new BeanPropertyRowMapper<>(User.class));
//    }
//
//}
