package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.UserDao;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    public void editUser(User user) {
        userDao.editUser(user);
    }

    @Transactional(readOnly=true)
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Transactional(readOnly=true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional(readOnly=true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.getUserByUsername(username);
    }


}


