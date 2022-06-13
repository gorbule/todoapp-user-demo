package com.todo.app.user.demo.business.service;

import com.todo.app.user.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Long id);

    List<User> getAllUsers();

    User saveUser(User newUser);

    User updateUser(User updatedUser);

    void deleteUser(Long id);
}
