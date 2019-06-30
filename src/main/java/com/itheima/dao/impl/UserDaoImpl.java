package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDaoImpl.save");
    }

    public UserDaoImpl(){
        //System.out.println("UserDaoImpl.instance initializer");
    }

    public void init(){
        System.out.println("UserDaoImpl.init");
    }

    public void destroy(){
        System.out.println("UserDaoImpl.destory");
    }
}
