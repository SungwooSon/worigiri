package com.worigiri;

import com.worigiri.user.MemoryUserRepository;
import com.worigiri.user.User;
import com.worigiri.user.UserService;
import com.worigiri.user.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserApp {

    public static void main(String[] args) {
        //UserService service = new UserServiceImpl(new MemoryUserRepository());
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = ac.getBean("userService", UserService.class);

        service.join(new User(1l, "sungwoo"));
        User user = service.findUser(1l);
        System.out.println("user = " + user.getName());
    }
}
