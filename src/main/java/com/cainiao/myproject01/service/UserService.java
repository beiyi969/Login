package com.cainiao.myproject01.service;

import com.cainiao.myproject01.bean.User;

public interface UserService {
    User checkUser(String name,String password);
}
