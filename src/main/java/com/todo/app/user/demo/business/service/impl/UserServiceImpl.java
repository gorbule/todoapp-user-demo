package com.todo.app.user.demo.business.service.impl;

import com.todo.app.user.demo.business.mapper.UserMapper;
import com.todo.app.user.demo.business.repository.UserRepository;
import com.todo.app.user.demo.business.service.UserService;
import com.todo.app.user.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User saveUser(User newUser) {
        return null;
    }

    @Override
    public User updateUser(User updatedUser) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
