package com.selfstudy.patterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) throws GetInstanceException {
        DBSingleton dbSingleton = DBSingleton.getInstance();
        System.out.println(dbSingleton);
        DBSingleton dbSingleton2 = DBSingleton.getInstance();
        System.out.println(dbSingleton2);
    }
}
