package com.sharp.service;

import com.sharp.domain.User;

import java.util.List;

/**
 * Created by 584003 on 2017/3/1.
 */
public interface UserService {

    List<User> queryUsers();

    User update(User user);

    void remove(Integer id);

    User save(User user);

}
