package com.worigiri.user;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUser(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void join(User user) {
        userRepository.save(user);
    }
}
