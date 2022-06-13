package com.todo.app.user.demo.business.mapper;

import com.todo.app.user.demo.business.repository.model.UserDAO;
import com.todo.app.user.demo.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userDAOtoUser (UserDAO userDAO);
    UserDAO userToUserDAO (User user);
}
