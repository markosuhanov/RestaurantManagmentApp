package com.suhIT.RestaurantManagmentApp.service;

import com.suhIT.RestaurantManagmentApp.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {


    public User create(User entity);

    public User update(User entity, UUID id);

    public void delete(UUID id);

    public List<User> findAll();

    public User findOne(UUID id);

    public User findByUsername(String username);


}
