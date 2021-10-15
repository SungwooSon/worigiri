package com.worigiri;

import com.worigiri.user.MemoryUserRepository;
import com.worigiri.user.UserRepository;
import com.worigiri.user.UserService;
import com.worigiri.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }

    @Bean
    public UserRepository userRepository() {
        return new MemoryUserRepository();
    }

}
