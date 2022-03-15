package org.example.Service;

import org.example.Model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    void addUsers(User user);
}
