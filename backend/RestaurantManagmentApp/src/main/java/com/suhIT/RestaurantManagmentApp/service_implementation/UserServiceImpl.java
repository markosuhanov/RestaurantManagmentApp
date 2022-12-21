package com.suhIT.RestaurantManagmentApp.service_implementation;

import com.suhIT.RestaurantManagmentApp.model.User;
import com.suhIT.RestaurantManagmentApp.repository.UserRepository;
import com.suhIT.RestaurantManagmentApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public User update(User entity, UUID id) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOne(UUID id) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }


}
