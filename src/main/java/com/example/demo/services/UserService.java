package com.example.demo.services;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService
{
    User findById(Long id);
    List<User> findAll();
}
