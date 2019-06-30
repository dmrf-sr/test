package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    @Test
    public void test(){
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = factory.getBean(UserService.class);
        userService.save();
    }

    @Test
    public void test2(){
        SingletonTest instance = SingletonTest.getInstance();
        SingletonTest instance1 = SingletonTest.getInstance();
        System.out.println(instance == instance1);
    }
}
