package com.cainiao.myproject01.service;

import com.cainiao.myproject01.bean.User;
import com.cainiao.myproject01.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String name, String password) {
        User user = userRepository.findByNameAndPassword(name,password);
        return user;
    }
}
