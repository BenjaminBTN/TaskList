package ru.galkin.tasklist.domain.user;

import lombok.Data;

import java.util.Set;

@Data
public class User {

    private Long id;
    private String userName;
    private String name;
    private String password;
    private String passwordConfirmation;
    private Set<Role> roles;
    private List<Task> tasks;
}
