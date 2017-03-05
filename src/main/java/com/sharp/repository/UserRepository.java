package com.sharp.repository;

import com.sharp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 584003 on 2017/3/3.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(Integer id);

    List<User> findByAge(Integer age);

    List<User> findByNameContaining(String name);
}
