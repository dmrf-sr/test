package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserServiceImpl implements UserService {

    private Properties properties;
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private List<User> userList;
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    private Map<String, User> map;
    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        //System.out.println("UserServiceImpl.setUserDao");
        this.userDao = userDao;
    }

    public UserServiceImpl(){
        //System.out.println("UserServiceImpl.UserServiceImpl");
    }

    @Override
    public void save() {
        //System.out.println("UserServiceImpl.save");
        System.out.println(name);
        System.out.println(list);
        System.out.println(map);
        System.out.println(userList);
        System.out.println(properties);
        userDao.save();
    }
}
