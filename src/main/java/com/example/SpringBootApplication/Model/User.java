package com.example.SpringBootApplication.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private String Vorname;
    private String Email;

    public User(String name, String vorname, String email) {
        this.Name = name;
        this.Vorname = vorname;
        this.Email = email;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getVorname() {
        return Vorname;
    }

    public String getEmail() {
        return Email;
    }

}
