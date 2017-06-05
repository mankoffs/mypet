package com.manko.service;

import com.manko.common.User;

public interface UserService {
    User findUserByEmail(String email);
    void saveUser(User user);
}