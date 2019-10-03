package com.selfstudy.patterns.creational.singleton;

public class DBSingleton {
    private static volatile DBSingleton instance;

    public DBSingleton() throws GetInstanceException {
        // Thread Safe
        if (instance != null) {
            throw new GetInstanceException("Use getInstance() method to create");
        }

    }

    public static DBSingleton getInstance() throws GetInstanceException {
        if (instance == null) {
            synchronized (DBSingleton.class) {
                if (instance == null) {
                    instance = new DBSingleton();
                }
            }

        }
        return instance;
    }
}
