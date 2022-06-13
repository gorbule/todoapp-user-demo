package com.todo.app.user.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Component
public class User {

    //automatically generated value by DB
    private long id;

    @NonNull
    @NotEmpty
    private String firstName;

    @NonNull
    @NotEmpty
    private String lastName;

    @NonNull
    @NotEmpty
    private String email;

    @NonNull
    @NotEmpty
    private String password;


}
