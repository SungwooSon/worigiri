package com.worigiri.user;

import java.util.List;

public interface UserRepository {

    User findById(Long userId);
    List<User> findAll();
    void save(User user);
    //update
    //delete
}
