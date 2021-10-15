package com.worigiri.user;

public interface UserService {
    User findUser(Long userId);
    void join(User user);
}
