package ru.kata.spring.boot_security.demo.dao;



import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> listUsers();
    void createUser(User user);
    void removeUser(User user);
    User getUserById(int id);
    void updateUser(User user);

    User findByUsername (String username);
}
