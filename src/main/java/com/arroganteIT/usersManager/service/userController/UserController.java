package com.arroganteIT.usersManager.service.userController;

import com.arroganteIT.usersManager.persistance.userModel.User;
import com.arroganteIT.usersManager.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "saveUser", produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> saveUser (@RequestBody User user) {
        this.userService.save(user);
        return new ResponseEntity<>(user,  HttpStatus.CREATED);
    }

    @GetMapping(value = "getAllUsers", produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = this.userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
