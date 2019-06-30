package com.itheima.test;

import com.itheima.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    @Test
    public void test1(){
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = factory.getBean(UserDao.class);
        UserDao userDao2 = factory.getBean(UserDao.class);

        System.out.println(userDao1 == userDao2);
    }
}
