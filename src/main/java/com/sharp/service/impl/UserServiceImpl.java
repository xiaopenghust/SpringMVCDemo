package com.sharp.service.impl;

import com.sharp.domain.User;
import com.sharp.repository.UserRepository;
import com.sharp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 584003 on 2017/3/1.
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> queryUsers() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void remove(Integer id) {
        userRepository.delete(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

}
