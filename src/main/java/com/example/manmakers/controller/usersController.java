package com.example.manmakers.controller;
import java.util.List;
import com.example.manmakers.service.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.manmakers.entity.users;

@RestController
public class usersController {

    @Autowired
    private usersService userser;

    @GetMapping("/users")
    public List<users> getAllEmployees() {
        return userser.fetchAllUsers();
    }
}
