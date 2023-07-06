package com.example.pp312.dao;

import com.example.pp312.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsersList();
    User getUser(Integer id);
    void addUser(User user);
    void deleteUser(Integer id);
    void editUser(User user);
}
