package org.example.Service;

import org.example.Model.User;
import org.example.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class DefaultUserService implements UserService {


    @Autowired
    private UserRepository repository;

    public DefaultUserService() {
    }

    public void setRepository(UserRepository repository) {

        this.repository = repository;
    }


    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }


    @Override
    public void addUsers(User user) {
        repository.save(user);
    }


}
