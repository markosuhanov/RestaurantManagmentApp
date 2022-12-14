package com.suhIT.RestaurantManagmentApp.service;

import com.suhIT.RestaurantManagmentApp.model.User;

import java.util.List;

public interface UserService {

    public User findByUsername(String username);

    public List<User> findAll();

}
