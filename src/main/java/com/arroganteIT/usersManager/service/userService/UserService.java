package com.arroganteIT.usersManager.service.userService;

import com.arroganteIT.usersManager.persistance.userModel.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();
}
