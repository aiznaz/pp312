package com.example.pp312.service;

import com.example.pp312.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();
    User getUser(Integer id);
    void addUser(User user);
    void deleteUser(Integer id);
    void editUser(User user);
}
