package com.worigiri.user;

import com.worigiri.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    UserService userService;

    @BeforeEach
    void 초기작업() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        userService = ac.getBean("userService", UserService.class);
    }

    @Test
    void 저장_조회() {
        //UserService userService = new UserServiceImpl(new MemoryUserRepository());

        //AppConfig config = new AppConfig();
        //UserService userService = config.userService();

        userService.join(new User(1l, "sungwoo"));

        User user = userService.findUser(1l);

        assertThat(user.getName()).isEqualTo("sungwoo");
    }

}