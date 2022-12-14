package com.suhIT.RestaurantManagmentApp.service_implementation;

import com.suhIT.RestaurantManagmentApp.model.User;
import com.suhIT.RestaurantManagmentApp.repository.UserRepository;
import com.suhIT.RestaurantManagmentApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

}
