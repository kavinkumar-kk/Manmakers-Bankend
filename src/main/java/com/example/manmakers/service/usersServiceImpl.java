package com.example.manmakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.manmakers.entity.users;
import com.example.manmakers.repository.usersRepository;

import java.util.List;

@Service
public class usersServiceImpl implements usersService {

    @Autowired
    private usersRepository usersrepo;
    @Override
    public List<users> fetchAllUsers() {
        List<users> allUsers = usersrepo.findAll();
        return allUsers;
    }
}
