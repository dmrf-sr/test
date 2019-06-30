package com.itheima.test;

public class SingletonTest {
    private static SingletonTest st= null;
    static {
        st = new SingletonTest();
    }

    private SingletonTest(){
    }

    public static SingletonTest getInstance(){
        return st;
    }
}
