package com.worigiri.user;

import java.util.*;

public class MemoryUserRepository implements UserRepository{

    private final static Map<Long, User> store = new HashMap<>();

    @Override
    public User findById(Long userId) {
        return store.get(userId);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) {
        store.put(user.getId(), user);
    }
}
